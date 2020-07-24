package com.rn.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String home() {
		System.out.println("home requested");
		return "index";
	}

	@RequestMapping("/add")
	public ModelAndView add(@RequestParam("num1") int i, @RequestParam("num2") int j) {
		ModelAndView mav = new ModelAndView();
		// setting view Name
		mav.setViewName("result");
		int add = i + j;

		// setting model data
		mav.addObject("add", add);
		return mav;
	}

}
