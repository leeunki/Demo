/** 
 * Project Name:demo 
 * File Name:LoginHandlerInterceptor.java 
 * Package Name:com.lee.config 
 * Date:2022/11/0915:19:53 
 * Copyright (c) 2022, taoge@tmd.me All Rights Reserved. 
 * 
 */  
package com.lee.config;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/** 
 * ClassName:LoginHandlerInterceptor <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2022/11/09 15:19:53 <br/> 
 * @author   LeeUn 
 * @version   
 * @since    JDK 1.8 
 * @see       
 */
public class LoginHandlerInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		  
		//登录成功存储session
		Object loginUser = request.getSession().getAttribute("loginUser");
		
		if (loginUser==null) {//如果session没有值，说明未登录
			request.setAttribute("msg","ログインしてください");
			request.getRequestDispatcher("/index.html").forward(request, response);
			return false;
		}else {
			return true;
		}
		
	}

	
}
  
