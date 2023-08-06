package com.example.engine.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.engine.entity.Engine;
import com.example.engine.service.EngineService;

@RestController
@RequestMapping("/engine")
public class EngineController {
	@Autowired
	EngineService engineservice;
	
	
	
	@PostMapping("/")
	public Engine saveEngine(@RequestBody Engine e1) {
		return engineservice.saveEngine(e1);
		
	}
	
	@GetMapping("/{id}")
	public Engine getEnginebyId(@PathVariable Long id) {
		return engineservice.getEnginebyId(id);
	}
	
	
	
	
	
	

}
