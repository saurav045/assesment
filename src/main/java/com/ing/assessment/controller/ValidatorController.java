package com.ing.assessment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value="/validate")
public class ValidatorController {
	
	@Autowired
	private RestTemplate restTemplate;

	@GetMapping(value="/version/{url}")
	public boolean validate(@PathVariable String url) {
		boolean versionMatched = false;
		
		return versionMatched;
	}
}
