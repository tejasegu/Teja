package com.teja.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.teja.model.zipcode;

@RestController
public class ass3controller {
	

	@RequestMapping(value="/zipcode", method=RequestMethod.POST)
	public List zipcodes(@RequestBody zipcode code) {
		if(code.getZipcode()==534260) {
			
			code.setState("Andhra");
			code.setCountry("India");
			code.setCity("Palakollu");
			List cod=new ArrayList();
			cod.add(code);
			return cod;
			
		}
		return null;
	}
}
