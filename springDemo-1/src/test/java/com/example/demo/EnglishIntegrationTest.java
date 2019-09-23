/**
 * 
 */
package com.example.demo;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.demo.controller.GreetingController;
import com.example.demo.service.HelloWorldService;

/**
 * @author mbasithaa
 * Created on 22 Sep 2019
 * @Name Mohamed Basith
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:/spring/helloWorld-config.xml", "classpath*:/spring/helloWorld_eng-config.xml"})
class EnglishIntegrationTest {

	@Autowired
	HelloWorldService helloWorldService;
	
	
	@Test
	public void testHelloWorldEng() {
		String greeting = helloWorldService.getGreeting();
		
		assertEquals("Hello World", greeting);
	}

}
