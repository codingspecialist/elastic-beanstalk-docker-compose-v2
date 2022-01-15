package com.cos.blogactionaws.web;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

// 13.209.10.234
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class BlogControllerTest {
	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void home() {
		ResponseEntity<String> response = restTemplate.getForEntity("/", String.class);
		assertEquals("<h1>docker-compose-v1</h1>", response.getBody());
	}
}
