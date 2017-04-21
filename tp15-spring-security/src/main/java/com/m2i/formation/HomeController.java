package com.m2i.formation;


import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	
//	@RequestMapping(value = "/", method = RequestMethod.GET)
//	public String home() {
//		
//		return "home";
//	}
	@RequestMapping(value = "/admin/private", method = RequestMethod.GET)
	public String privatepage() {
		
		return "privatepage";
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(HttpServletRequest request) {
		System.out.println(request.getRemoteAddr());
		
		return "home";
	}
	@RequestMapping("/login")
		public String loggin(){
		return "loggin";
	}
}
