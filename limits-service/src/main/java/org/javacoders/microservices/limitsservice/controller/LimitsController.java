package org.javacoders.microservices.limitsservice.controller;

import org.javacoders.microservices.limitsservice.limitsservice.bean.Limits;
import org.javacoders.microservices.limitsservice.limitsservice.configuration.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {
	 
	private Configuration configuration;
	
	public LimitsController(Configuration configuration) {
		this.configuration = configuration;
	}
 
	@GetMapping("/limits")
	public Limits retrieveLImits() {
		return new Limits(configuration.getMinimum(), configuration.getMaximum());
//		return new Limits(1, 1000);
	}
}
