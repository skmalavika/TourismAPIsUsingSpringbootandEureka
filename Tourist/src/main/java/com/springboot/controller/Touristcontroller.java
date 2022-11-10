package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.model.Tourist;
import com.springboot.service.Touristservice;


@RestController
@RequestMapping("/pass")
@CrossOrigin(origins = "http://localhost:4200")
public class Touristcontroller {
	@Autowired
	private Touristservice touristservice;
	
	
	@PostMapping("/add")
	public Tourist saveTourist(@RequestBody Tourist tourist) {
		return touristservice.saveTourist(tourist);		
	}
	@GetMapping("/passengers")
	public List<Tourist>getAllTourist(){
		return touristservice.getAllTourist();
	}
	@GetMapping("/sort")
	public List<Tourist>AllOrderByNameDesc()
	{
		return touristservice.AllOrderByNameDesc();
	}
	
}
