package com.teja;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SimpleInterestController {
@RequestMapping("/sim")
	public ModelAndView simpleinterest(HttpServletRequest request, HttpServletResponse resopnse) {
		double p = Double.parseDouble(request.getParameter("p"));
		double r = Double.parseDouble(request.getParameter("r"));
		double t = Double.parseDouble(request.getParameter("t"));
		double s= (p*r*t)/100;
		ModelAndView mv=new ModelAndView();
		mv.setViewName("submit.jsp");
		mv.addObject("result",s);
		return mv;
	}
	
	
}
