package com.pluszkie.herokutest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class HerokuTestApplication {

	@GetMapping("/test")
	@ResponseBody
	String home() {
		return "Dzień Dobry Bardziej";
	}

	public static void main(String[] args) {
		SpringApplication.run(HerokuTestApplication.class, args);
	}

}
