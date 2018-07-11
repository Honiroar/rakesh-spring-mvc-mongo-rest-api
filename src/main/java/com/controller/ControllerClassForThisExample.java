package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerClassForThisExample {

	@RequestMapping("/welcome")
	public ModelAndView hellomongodb(){
		String message="I am trying to Connect with Mongodb";
		return new ModelAndView("welcome", "message", message);
		
	}
}
