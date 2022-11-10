/** 
 * Project Name:demo 
 * File Name:LoginController.java 
 * Package Name:com.lee.controller 
 * Date:2022/11/0914:51:32 
 * Copyright (c) 2022, taoge@tmd.me All Rights Reserved. 
 * 
 */  
package com.lee.controller;

import java.lang.ProcessBuilder.Redirect;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/** 
 * ClassName:LoginController <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2022/11/09 14:51:32 <br/> 
 * @author   LeeUn 
 * @version   
 * @since    JDK 1.8 
 * @see       
 */
@Controller
public class LoginController {
	
	@RequestMapping("/login")
	public String login(@RequestParam("exampleInputEmail1")String email,@RequestParam("exampleInputPassword1")String password,Model model,HttpSession session) {
		
		if (!email.isEmpty() && "1234".equals(password)) {
			session.setAttribute("loginUser", email);
			return "redirect:/index.html";
		}else {
			model.addAttribute("msg", "メールアドレスまたはパスワードが正しくありません。");
		}
		return null;
	}

}
  
