package com.hch.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.hch.model.VoUserPerson;
import com.hch.model.XtUser;
import com.hch.service.UserService;
import com.hch.util.MD5Tools;

@Controller
@RequestMapping(value="/user")
public class UserController {
@Autowired
private UserService ua;
//通过id找到用户
@RequestMapping(value="/sell.do")
public String seluser()
{
	XtUser user =ua.selectByPrimaryKey("1");
	System.out.println(user.getPassword());
  return "";	
}
//用户登录
//登录成功的跳转
	@RequestMapping(value="/goSuccess.do")
	@ResponseBody
	public String goSuccessPage(XtUser user ,HttpServletRequest request,HttpServletResponse response) 
	{
		
		String rCode=request.getParameter("codeValue");
		String sCode= (String) request.getSession().getAttribute("sessionCode");
		 request.getSession().removeAttribute("sessionCode");
	
		 
		 //判断两次验证码是否
		   if(!rCode.equalsIgnoreCase(sCode))
		   {
			   //输入不一致
			    return "fail2";
		   }
		   user.setPassword(MD5Tools.convertMD5(user.getPassword()));
		   XtUser xtuser = ua.selectByuser(user);
		   if(xtuser!=null)
		   {
			   request.getSession().setAttribute("userPeople",xtuser);
			   return "success";
		   }
		   
		    
		
    return "fail3";
		
	}
	
	
	@RequestMapping(value="/updatePwd.do")
	@ResponseBody
	public String updatePwd(XtUser user,HttpServletRequest request,HttpServletResponse response) throws IOException
	{
	    String pwd =request.getParameter("password1");
	    user.setPassword(MD5Tools.convertMD5(pwd));
		if(ua.updatePwd(user)==true)
		{
			return "success";
		}
		else return "fail";
        
	}
	
	@RequestMapping(value="/checkPwd.do")
	@ResponseBody
	public String checkName(XtUser user,HttpServletRequest request,HttpServletResponse response) throws IOException
	{
	
		user.setPassword(MD5Tools.convertMD5(user.getPassword()));
		XtUser user1=ua.checkPwd(user);
		if(user1!=null)
		{
			return "success";
		}
		else return "fail";
        
	}
	
	 @ResponseBody
	    @RequestMapping(value="/updateState.do")
	    public String prirelFlights(HttpServletRequest request){
		 String rightstr =request.getParameter("prirelRightJson");
		 Gson gson =new Gson();
		 List<String> rightlist =gson.fromJson(rightstr, List.class);
		 String leftstr =request.getParameter("prirelLeftJson");
		 List<String> leftlist =gson.fromJson(leftstr, List.class);
		 for(String right:rightlist)
		 {
			 ua.updatePeState0(right);
		 }
		 for(String left:leftlist)
		 {
			 ua.updatePeState1(left);
		 }
		 /*Gson gson =new Gson();*/
		/*List<String> list = gson.fromJson(prirelFlights, List.class);*/
		/*for(String kk:list)
		{
			ua.updatePeState0(kk);
		}*/
      
	        return "success";
	    }
	 public static void main(String[] args) {
		 
		
     
	}
}
