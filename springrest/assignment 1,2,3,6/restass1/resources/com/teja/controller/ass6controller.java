package com.teja.controller;


import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.teja.model.numbermodel;

@RestController
public class ass6controller {


	@RequestMapping(value="/numbers/add", method=RequestMethod.POST)
	public  Object add(@RequestBody numbermodel code) {
		return code.getA()+code.getB();
	}
	@RequestMapping(value="/numbers/sub", method=RequestMethod.POST)
	public  Object sub(@RequestBody numbermodel code) {
		return code.getA()-code.getB();
	}
	@RequestMapping(value="/numbers/mul", method=RequestMethod.POST)
	public  Object mul(@RequestBody numbermodel code) {
		return code.getA()*code.getB();
	}
	@RequestMapping(value="/numbers/div", method=RequestMethod.POST)
	public  Object div(@RequestBody numbermodel code) {
		return code.getA()/code.getB();
	}
	@RequestMapping(value="/numbers/sqt", method=RequestMethod.POST)
	public  Object sqt(@RequestBody numbermodel code) {
		return Math.sqrt(code.getA());
	}
	
	
	
	
}
