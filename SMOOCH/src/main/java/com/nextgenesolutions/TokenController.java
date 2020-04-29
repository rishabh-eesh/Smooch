package com.nextgenesolutions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TokenController {
	 		
	@Autowired
	private TokenGenerator tokenGenerator;
	
	@RequestMapping(value = "/", produces = "application/json", method = RequestMethod.GET)
	public String hello() {
		return "Smooch App server by Rishabh";
	}
	
	@RequestMapping(value = "/accessToken", produces = "application/json", method = RequestMethod.GET)
	public String token(@RequestParam("identity") String identity) {
		
		String accessToken = tokenGenerator.generateToken(identity); 
		System.out.println(accessToken);
		
		return accessToken;
	}
}
