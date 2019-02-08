package com.ing.assessment.controller;

import java.net.URL;
import java.net.URLEncoder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.resource.VersionResourceResolver;

import com.ing.assessment.model.BlueMixVersion;
import com.ing.assessment.model.PCFVersion;

@RestController
@RequestMapping(value = "/validate")
public class ValidatorController {

	private final String PCF_URL = "https://api.run.pivotal.io/v2/info";
	private final String PCF_VERSION = "2.63.0";
	private final String BLUEMIX_URL = "https://api.ng.bluemix.net/v2/info ";
	private final String BLUEMIX_VERSION = "2.54.0";

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

	@GetMapping(value = "/version/pcf")
	public boolean validatePcfUrl() {
		boolean versionMatched = false;
		PCFVersion versionResponse = restTemplate().getForObject(PCF_URL, PCFVersion.class);
		if (PCF_VERSION.equals(versionResponse.getApi_version())) {
			versionMatched = true;
		}
		return versionMatched;
	}
	
	@GetMapping(value = "/version/bluemix")
	public boolean validateBlueMixUrl() {
		boolean versionMatched = false;
		BlueMixVersion versionResponse = restTemplate().getForObject(BLUEMIX_URL, BlueMixVersion.class);
		if (BLUEMIX_VERSION.equals(versionResponse.getApi_version())) {
			versionMatched = true;
		}
		return versionMatched;
	}
}
