package com.hch.controller;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.List;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hch.model.VoUserPerson;
import com.hch.model.XtUser;
import com.hch.service.UserService;

@Controller
@RequestMapping(value="/jumps")
public class JumpController {
	@Autowired
	private UserService ua;
	
//跳转到拍单表
	@RequestMapping(value="/paidan.do")
	public String pandan(@RequestParam("uids")String uid,HttpServletRequest request)
	{
		request.setAttribute("uid",uid);
		System.out.println(uid);
	  return "paidan/paidanForm";	
	}
//跳转到用户登录	
@RequestMapping(value="/goLoginPage.do")
public String loginIndex()
{
  return "jump/userLogin";	
}
//跳转到修改密码
@RequestMapping(value="/goChangePwd.do")
public String jumpChangePwd(HttpServletRequest request)
{
	List<XtUser> users=ua.userXiaLa("10x");
	request.setAttribute("dicList", users);
	return "jump/userChangePwd";
}
//跳转到显示值班人员
@RequestMapping(value="/goShowZhiBan.do")
public String goShowZhiBan(HttpServletRequest request)
{
	List<VoUserPerson> vo1=ua.selectZBpeople("1");
	List<VoUserPerson> vo2=ua.selectZBpeople("0");
	request.setAttribute("zhiban",vo1);
	request.setAttribute("weizhiban",vo2);
	return "paidan/showPeople";
}
//验证码
@RequestMapping(value="/goCode.do")
public void goCodePage(HttpServletRequest request,HttpServletResponse response) throws IOException
{
//随机图片		int charNum = 4;
	int width = 30 * 4;
	int height = 30;

	// 1. 创建一张内存图片
	BufferedImage bufferedImage = new BufferedImage(width, height,
			BufferedImage.TYPE_INT_RGB);

	// 2.获得绘图对象
	Graphics graphics = bufferedImage.getGraphics();

	// 3、绘制背景颜色
	graphics.setColor(Color.YELLOW);
	graphics.fillRect(0, 0, width, height);

	// 4、绘制图片边框
	graphics.setColor(Color.BLUE);
	graphics.drawRect(0, 0, width - 1, height - 1);

	// 5、输出验证码内容
	graphics.setColor(Color.RED);
	graphics.setFont(new Font("宋体", Font.BOLD, 20));

	// 随机输出4个字符
	Graphics2D graphics2d = (Graphics2D) graphics;
	 String s = "ABCDEFGHGKLMNPQRSTUVWXYZ23456789";
	Random random = new Random();
	//session中要用到
	String msg="";
	int x = 5;
	for (int i = 0; i < 4; i++) {
		int index = random.nextInt(32);
		String content = String.valueOf(s.charAt(index));
		msg+=content;
		double theta = random.nextInt(45) * Math.PI / 180;
		//让字体扭曲
        graphics2d.rotate(theta, x, 18);
		graphics2d.drawString(content, x, 18);
		graphics2d.rotate(-theta, x, 18);
		x += 30;
	}
      //将验证码放入session中
request.getSession().setAttribute("sessionCode",msg);
	// 6、绘制干扰线
	graphics.setColor(Color.GRAY);
	for (int i = 0; i < 5; i++) {
		int x1 = random.nextInt(width);
		int x2 = random.nextInt(width);

		int y1 = random.nextInt(height);
		int y2 = random.nextInt(height);
		graphics.drawLine(x1, y1, x2, y2);
	}

	// 释放资源
	graphics.dispose();

	// 图片输出 ImageIO
	ImageIO.write(bufferedImage, "jpg", response.getOutputStream());
	
}
}
