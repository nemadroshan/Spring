package com.rn.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String home() {
		System.out.println("home requested");
		return "index";
	}
	
	@RequestMapping("/add")
	public String add(HttpServletRequest request) {
		int i =Integer.parseInt(request.getParameter("num1"));
		int j =Integer.parseInt(request.getParameter("num2"));
		int add =i+j;
		HttpSession session = request.getSession();
		session.setAttribute("add", add);
		return "result";
	}

}
