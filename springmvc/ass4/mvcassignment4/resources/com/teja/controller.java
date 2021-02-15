package com.teja;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.teja.bean.userdetails;
import com.teja.dao.*;


@Controller
public class controller {
	 @Autowired  
	    dao dao;
		
		/*
		 * @RequestMapping(value ="/register", method = RequestMethod.GET) public
		 * ModelAndView showRegister(HttpServletRequest request, HttpServletResponse
		 * response) { ModelAndView mav = new ModelAndView("register.jsp");
		 * mav.addObject("user", new userdetails());
		 * 
		 * return mav; }
		 */
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	  public ModelAndView addUser(HttpServletRequest request, HttpServletResponse response,
	      @ModelAttribute("user") userdetails user) {

	    dao.register(user);

	    return new ModelAndView("login.jsp");
	  }
	
		/*
		 * @RequestMapping(value = "/login", method = RequestMethod.GET) public
		 * ModelAndView showLogin(HttpServletRequest request, HttpServletResponse
		 * response) { ModelAndView mav = new ModelAndView("login.jsp");
		 * mav.addObject("login", new userdetails());
		 * 
		 * return mav; }
		 */
	 @RequestMapping(value = "/login", method = RequestMethod.GET)
	  public ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse response,
	      @ModelAttribute("login") userdetails login) {
	    ModelAndView mav = null;

	    userdetails user = dao.validateUser(login);

	    if (null != user) {
	      mav = new ModelAndView("success.jsp");
	      mav.addObject("firstname", user.getUsername());
	    } else {
	      mav = new ModelAndView("fail.jsp");
	      mav.addObject("message", "Username or Password is wrong!!");
	    }

	    return mav;
	  }
}
