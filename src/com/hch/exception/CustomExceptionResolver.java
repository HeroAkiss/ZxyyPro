package com.hch.exception;

import java.io.PrintWriter;
import java.io.StringWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

public class CustomExceptionResolver implements HandlerExceptionResolver {

	@Override
	public ModelAndView resolveException(HttpServletRequest arg0, HttpServletResponse arg1, Object handler,
			Exception ex) {
		// TODO Auto-generated method stub

		ex.printStackTrace();

		CustomException customException = null;
		
		//如果抛出的是系统自定义异常则直接转换
		if(ex instanceof CustomException){
			customException = (CustomException)ex;
		}else{
			//如果抛出的不是系统自定义异常则重新构造一个系统错误异常。
			customException = new CustomException("系统错误，请与系统管理 员联系！");
		}
		
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("message", customException.getMessage());
		modelAndView.setViewName("/exception/Ex");

		 try {
				
			} catch (Exception e) {
				StringWriter s = new StringWriter();
				PrintWriter printWriter = new PrintWriter(s);
				e.printStackTrace(printWriter);
				s.toString();
			}
		
		return modelAndView;
	}

	 

}
		

