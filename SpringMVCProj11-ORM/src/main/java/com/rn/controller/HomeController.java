package com.rn.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

	@PostMapping("/addAliean")
	public String addAlien(@ModelAttribute("alien") Alien alien) {
		dao.insertAlien(alien);
		return "result";
	}

	@ModelAttribute
	public void addModaldata(Model model) {
		model.addAttribute("name", "roshan");
	}

	@GetMapping("/getAliens")
	public String getAllAliens(Map<String, Object> map) {
		List<Alien> alies = dao.getAlies();
		map.put("aliens", alies);
		return "showAlien";
	}

	@GetMapping("/getAlienById")
	public String getAllAliens(@RequestParam("id") int id, Map<String, Object> map) {
		Alien alien = dao.getAlienById(id);
		map.put("aliens", alien);
		return "showAlien";
	}


}
