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
		
		//����׳�����ϵͳ�Զ����쳣��ֱ��ת��
		if(ex instanceof CustomException){
			customException = (CustomException)ex;
		}else{
			//����׳��Ĳ���ϵͳ�Զ����쳣�����¹���һ��ϵͳ�����쳣��
			customException = new CustomException("ϵͳ��������ϵͳ���� Ա��ϵ��");
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
		
