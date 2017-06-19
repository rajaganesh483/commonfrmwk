package com.boot.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondController {

	 @RequestMapping("/greeting1")
	    public String greeting() {
	        return "Greetings 2";
	    }
}
