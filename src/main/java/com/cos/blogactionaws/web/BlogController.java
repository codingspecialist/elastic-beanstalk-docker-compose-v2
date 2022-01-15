package com.cos.blogactionaws.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BlogController {

	@GetMapping("/")
	public String home() {
		return "<h1>docker-compose-v1</h1>";
	}
}
