package com.rn.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.rn.model.Alien;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String home() {
		System.out.println("home requested");
		return "index";
	}

	@RequestMapping("/addAliean")
	public String addAlien(@ModelAttribute("alien") Alien alien) {
		return "result";
	}

	@ModelAttribute
	public void addModaldata(Model model) {
		model.addAttribute("name", "roshan");
	}

}
