package com.ikiugu.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	@RequestMapping("/processForm")
	public String showOtherForm() {
		return "helloworld";
	}
	
	@RequestMapping("/processFormVersionTwo")
	public String letsShout(HttpServletRequest request, Model model) {
		
		// read the request from the html form
		String theName = request.getParameter("studentName");
		
		// convert the data (uppercase)
		theName = theName.toUpperCase();
		
		// create the message
		String result = "Hey!!! " + theName;
		
		// add the message to the model
		model.addAttribute("message", result);
		
		// return the message
		return "helloworld";
		
	}
}
