package com.trishaitschool.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String getHome(Model model) {
		model.addAttribute("title", "HOME");
		model.addAttribute("message", "This is a home page!!!");
		return "index";
	}
}
