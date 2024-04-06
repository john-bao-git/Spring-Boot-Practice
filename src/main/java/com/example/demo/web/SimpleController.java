package com.example.demo.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SimpleController {
	@Value("${spring.application.name}")
	String appName;
	
	@Value("${spring.application.title}")
	String titleName;
	
	@GetMapping("/")
	public String homePage(Model model) {
		model.addAttribute("appName", appName);
		model.addAttribute("titleName", titleName);
		
		return "home";
	}
}
