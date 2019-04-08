package com.techstack.helloworld.runner;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertFalse;

@SpringBootTest(classes = HelloWorldApplication.class)
public class HelloWorldApplicationTests {

	@Test
	@DisplayName("Load application context")
	public void contextLoads() {
		// application context started
	}

	@Test
	@DisplayName("Test to fail")
	public void fail() {
		assertFalse(false);
	}

}
