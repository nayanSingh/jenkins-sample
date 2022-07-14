package com.nk.jenkinssample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestAPIsController {

	@GetMapping
	public String testApi() {
		return "Jenkins Deployment Tested Successfully";
	}

}
