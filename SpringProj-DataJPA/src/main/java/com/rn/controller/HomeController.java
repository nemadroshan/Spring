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

import com.rn.model.Alien;
import com.rn.repository.AlieanRepository;

@Controller
public class HomeController {
	@Autowired
	private AlieanRepository repo;

	@RequestMapping("/")
	public String home() {
		System.out.println("home requested");
		return "index";
	}

	// @RequestMapping(path = "/addAliean" , method = RequestMethod.POST)
	// @RequestMapping Support both all httpMethods

	@PostMapping("/addAliean")
	public String addAlien(Map<String, Object> map, @RequestParam("id") int id, @RequestParam("name") String name,
			@RequestParam("adrs") String adrs) {
		Alien alien = new Alien();
		alien.setAddress(adrs);
		alien.setAid(id);
		alien.setAname(name);
		repo.save(alien);
		map.put("result", alien);
		return "result";
	}

	@ModelAttribute
	public void addModaldata(Model model) {
		model.addAttribute("name", "roshan");
	}

	@GetMapping("/getAllAliean")
	public String getAllAliens(Map<String, Object> map) {

		List<Alien> aliens = repo.findAll();
		map.put("result", aliens);
		return "result";
	}

	@GetMapping("/getById")
	public String getAlieanById(@RequestParam("id") int id, Map<String, Object> map) {
		Alien alien = repo.getOne(id);
		map.put("result", alien);
		return "result";
	}
	
	@GetMapping("/getByName")
	public String getAlieanById(@RequestParam("name") String name, Map<String, Object> map) {
		Alien alien = repo.findByAname(name);
		map.put("result", alien);
		return "result";
	}
	
	@GetMapping("/getListByName")
	public String getListAlieanByName(@RequestParam("name") String name, Map<String, Object> map) {
		List<Alien> aliens = repo.find(name);
		map.put("result", aliens);
		return "result";
	}
	

}
