package com.teja.controller;


import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.teja.model.usermodel;


@RestController
public class ass2controller {

	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(@RequestBody usermodel model ){
	
		if(model.getPassword()!=null && model.getUsername()!=null  && model.getUsername().equals("Teja") && model.getPassword().equals("teja12")) {
	
			return "success";
		}
		else {
			
			return "fail";
		}
}
}
