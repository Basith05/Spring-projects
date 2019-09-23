package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest
@ContextConfiguration(locations ="file:src/main/resources/spring/spring-config.xml")
class SpringDemo1ApplicationTests {

	@Test
	void contextLoads() {
	}

}
