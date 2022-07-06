package com.suraj.junit5.mockito.unitTest;

import com.suraj.junit5.mockito.interfaces.Greetings;

public class GreetingsImpl implements Greetings {
	
	private GreetingService service;

	public String sayHello(String name) {
		return service.sayHello(name);
	}

}
