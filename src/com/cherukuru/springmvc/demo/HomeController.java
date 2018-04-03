package com.cherukuru.springmvc.demo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

// This tells Spring that this is an MVC controller
// Controller inherits Component.
@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String showPage() {
		return "home-page";
	}
	
	// New controller method to read form data and add data to the model
	/*
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		
		// Read the request parameter from HTML form
		String theName=request.getParameter("studentNameTwo");
		
		// Convert data to all Caps
		theName=theName.toUpperCase();
		  
		// Create the message
		String result="Yo! " + theName;
		
		// Add message to the model
		model.addAttribute("message", result);
		
		return "process-form";
		
	}	
	*/
}