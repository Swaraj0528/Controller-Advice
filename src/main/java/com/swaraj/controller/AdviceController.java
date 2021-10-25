package com.swaraj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.swaraj.service.AdviceService;

@RestController
public class AdviceController {
	
	@Autowired
	AdviceService adviceservice;

	@GetMapping("/{id}")
	String demoMethod(@PathVariable(value = "id") String id) {
		
		return adviceservice.demoMethod(id);
	}

}
