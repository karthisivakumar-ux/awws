package com.awsnew;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/get")
public class Aws {	
	@GetMapping(value="/abc")
	public String get(String a) {
		return "AWS";
	}
}
