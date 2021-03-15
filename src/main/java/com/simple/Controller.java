package com.simple;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class Controller {
	
	@GetMapping("/simpletest")
	public String test()
	{
		return "Simple Test Spring boot app1";
	}

}
