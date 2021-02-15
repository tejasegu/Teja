package com.teja;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ass3.usermodel;

@Controller
public class login {
	
	@ModelAttribute("usermodel")
	public void usercred() {
		
	}

	@RequestMapping("/login")
	public String login(@ModelAttribute("user") usermodel user , Model model){
	
		if(user.getPassword()!=null && user.getUsername()!=null && user.getEmail()!=null && user.getUsername().equals("Teja") && user.getPassword().equals("teja12")) {
			model.addAttribute("message", user.getUsername());
		
			return "success.jsp";
		}
		else {
			ModelAndView mv=new ModelAndView();
			mv.setViewName("fail.jsp");
			model.addAttribute("mesage", "Please enter valid credentials for username "+ user.getUsername());
			return "fail.jsp";
		}
	}

}