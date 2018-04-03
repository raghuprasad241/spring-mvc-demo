package com.cherukuru.springmvc.demo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "show-form";
	}
	
	@RequestMapping("/processFormVersionOne")
	public String processFormVersionOne() {
		return "process-form-one";
	}
	
	
	@RequestMapping("/processFormVersionTwo")
	public String ProcessFormVersion2(HttpServletRequest request, Model model) {
			
			// Read the request parameter from HTML form
			String theName=request.getParameter("studentNameTwo");
			
			// Convert data to all Caps
			theName=theName.toUpperCase();
			
			// Create the message
			String result="Yo! " + theName;
			
			// Add message to the model
			model.addAttribute("message", result);
			
			return "process-form-two";
	}
	
	
	// Here we are using @RequestParam to directly bind the request parameter to the variable.
	@RequestMapping("/processFormVersionThree")
	public String processFormVersion3(@RequestParam("studentNameThree") String theName, Model model) {
			
			// Convert data to all Caps
			theName=theName.toUpperCase();
			
			// Create the message
			String result="Hey Homie " + theName;
			
			// Add message to the model
			model.addAttribute("message", result);
			
			return "process-form-three";
	}
	
}