package com.rn.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.rn.entity.Alien;
import com.rn.repository.AlieanRepository;

@RestController
public class HomeController {
	@Autowired
	private AlieanRepository repo;

	@PostMapping(path = "/addAliean",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Alien addAlien(@RequestBody Alien alien) {
		Alien save = repo.save(alien);
		return save;
	}

	@GetMapping("/getAllAliean")
	public @ResponseBody List<Alien> getAllAliens() {

		List<Alien> aliens = repo.findAll();
		return aliens;
	}

	@GetMapping("/getById/{id}")
	public Alien getAlieanById(@PathVariable("id") int id) {
		Alien alien = repo.getOne(id);
		return alien;
	}

	@GetMapping("/getByName/{name}")
	public @ResponseBody Alien getAlieanById(@PathParam("name") String name) {
		Alien alien = repo.findByAname(name);
		return alien;
	}

	@GetMapping("/getListByName/{name}")
	public @ResponseBody List<Alien> getListAlieanByName(@PathParam("name") String name) {
		List<Alien> aliens = repo.find(name);
		return aliens;
	}

}
