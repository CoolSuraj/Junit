package com.suraj.junit5.mockito.unitTest;

public class GreetingServiceImpl implements GreetingService {

	public String sayHello(String name) {
		if (name == null || name.length() == 0) {
			throw new IllegalArgumentException(); // throwing Exception
		}
		return "My name is " + name;
	}
}
