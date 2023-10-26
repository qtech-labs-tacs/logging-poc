package com.qtechlabstacs.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggingController {

	
	private static final Logger log = LoggerFactory.getLogger(LoggingController.class);
	
	@GetMapping("/api/v1/logging")
	public ResponseEntity<String> logging(){
		
		log.info("INFO Level Log Enabled");
		log.warn("WARN Level Log Enabled");
		log.error("ERROR Level Log Enabled");
		
		log.debug("DEBUG Level Log Enabled");
		log.trace("TRACE Level Log Enabled");
		
		return new ResponseEntity<String>("Logging Done", HttpStatus.OK);
	}
	
}
