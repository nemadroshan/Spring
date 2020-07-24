package com.rn.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
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
		int res = i + j;
		// setting model data
		mav.addObject("res", res);
		return mav;
	}

	@RequestMapping("/sub")
	public String sub(@RequestParam("num1") int i, @RequestParam("num2") int j, Model mav) {
		// setting view Name
		int res = i - j;
		// setting model data
		mav.addAttribute("res", res);
		return "result";
	}

	// using ModelMap
	@RequestMapping("/mul")
	public String mul(@RequestParam("num1") int i, @RequestParam("num2") int j, ModelMap map) {
		// setting view Name
		int res = i * j;
		// setting model data
		map.addAttribute("res", res);
		return "result";
	}

	// Best Signature
	@RequestMapping("/div")
	public String div(@RequestParam("num1") int i, @RequestParam("num2") int j, Map map) {
		// setting view Name
		int res = i / j;
		// setting model data
		map.put("res", res);
		return "result";
	}
}
