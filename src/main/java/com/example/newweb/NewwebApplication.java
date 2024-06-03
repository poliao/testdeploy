package com.example.newweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class NewwebApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewwebApplication.class, args);
	}

	@RestController
    class HelloWorldController {
        @GetMapping("/hello")
        public String hello() {
            return "สวัสดี โลก!";
        }
    }
}
