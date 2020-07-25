package com.rn.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rn.dao.AlienDao;
import com.rn.model.Alien;

@Controller
public class HomeController {
	@Autowired
	private AlienDao dao;

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
	
	@GetMapping("getAliens")
	  public String getAllAliens(Map<String, Object> map) {
		List<Alien> alies = dao.getAlies();
		map.put("aliens", alies);
		return "showAlien";
	}

}
