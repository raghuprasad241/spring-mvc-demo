package com.cherukuru.springmvc.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// This tells Spring that this is an MVC controller
// Controller inherits Component.
@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String showPage() {
		return "home-page";
	}
	
}