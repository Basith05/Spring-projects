package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.example.demo.service.HelloWorldService;
import com.example.demo.service.HelloWorldTamilImpl;


/**
 * @author mbasithaa
 * Created on 22 Sep 2019
 * @Name Mohamed Basith
 */

//@Controller
public class GreetingController {
	
	private HelloWorldService helloWorldService;
	
	private HelloWorldService helloWorldServiceTamil;
	
	private HelloWorldService helloWorldServiceEng2;
	
	
	public void setHelloWorldService(HelloWorldService helloWorldService) {
		this.helloWorldService = helloWorldService;
	}
	
	//@Autowired
	//@Qualifier("helloWorldServiceTamil")
	public void setHelloWorldServiceTamil(HelloWorldService helloWorldServiceTamil) {
		this.helloWorldServiceTamil = helloWorldServiceTamil;
	}
	
	
	//@Autowired
	//@Qualifier("eng2")
	public void setHelloWorldServiceEng2(HelloWorldService helloWorldServiceEng2) {
		this.helloWorldServiceEng2 = helloWorldServiceEng2;
	}

	public String sayHello() {
		
		String greeting = helloWorldService.getGreeting();
		
		System.out.println(greeting);
		System.out.println(helloWorldServiceTamil.getGreeting());
		System.out.println(helloWorldServiceEng2.getGreeting());
		
		return greeting;
	}

}
