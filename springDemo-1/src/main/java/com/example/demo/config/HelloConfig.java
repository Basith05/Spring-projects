package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import com.example.demo.service.HelloWorldEngImpl;
import com.example.demo.service.HelloWorldFactory;
import com.example.demo.service.HelloWorldService;
import com.example.demo.service.HelloWorldTamilImpl;

@Configuration
public class HelloConfig {

	/*
	 * @Bean public HelloWorldFactory helloWorldFactory() { return new
	 * HelloWorldFactory(); }
	 */

	/*
	 * @Bean
	 * 
	 * @Profile("english")
	 * 
	 * @Primary public HelloWorldService helloWorldServiceEng(HelloWorldFactory
	 * factory) { return factory.createHelloWorldService("eng"); }
	 */

	/*
	 * @Bean public HelloWorldService helloWorldServiceTamil(HelloWorldFactory
	 * factory) { return factory.createHelloWorldService("tml"); }
	 */

	// @Bean(name = "eng2")
	// public HelloWorldService helloWorldServiceEng2(HelloWorldFactory factory) {
	// return factory.createHelloWorldService("eng");
	// }
}
