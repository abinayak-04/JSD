package com.abispring.demoproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
		@GetMapping("/test")
		public String test() {
			return "<h1>Hello Springboot</h1>";
		}
	@GetMapping("/abi")
		public String add() {
		int a=199;
		int b=60;
		return "<h3>Total of "+a+"and "+b+":"+(a+b)+"</h3>";
	}
	}

	