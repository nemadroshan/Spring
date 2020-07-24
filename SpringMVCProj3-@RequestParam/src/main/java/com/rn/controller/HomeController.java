package com.rn.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String home() {
		System.out.println("home requested");
		return "index";
	}

	@RequestMapping("/add")
	public String add(@RequestParam("num1") int i, @RequestParam("num2") int j, HttpSession session) {
		int add = i + j;
		session.setAttribute("add", add);
		return "result";
	}

}
