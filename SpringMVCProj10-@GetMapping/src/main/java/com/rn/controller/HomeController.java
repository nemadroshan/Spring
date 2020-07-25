package com.rn.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

	// @RequestMapping(path = "/addAliean" , method = RequestMethod.POST)
	//@RequestMapping Support both all httpMethods
	
	@PostMapping("/addAliean")
	public String addAlien(@ModelAttribute("alien") Alien alien) {
		return "result";
	}

	@ModelAttribute
	public void addModaldata(Model model) {
		model.addAttribute("name", "roshan");
	}
	
	@GetMapping("/getAllAliean")
	public String getAllAlieans(Map<String, Object> map) {
		List<Alien> aliens = Arrays.asList(
				new Alien("Roshan",101),
				new Alien("Raja", 102),
				new Alien("Rani",103)
				);
		map.put("aliens",aliens);
		return "showAliens";
	}

}
