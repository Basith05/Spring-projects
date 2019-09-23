package com.example.demo.service;

/**
 * @author mbasithaa
 * Created on 22 Sep 2019
 * @Name Mohamed Basith
 */

public class HelloWorldFactory {
	
	public HelloWorldService createHelloWorldService(String Language) {
		
		if(Language.equals("eng")) {
			return new HelloWorldEngImpl();
		}else {
			return new HelloWorldTamilImpl();
		}
		
	}

}
