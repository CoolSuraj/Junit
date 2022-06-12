package com.suraj.course.junit.impl;

import com.suraj.course.junit.interfaces.Greetings;

public class GreetingsImpl implements Greetings {

	@Override
	public String sayHello(String name) {
		if (name == null || name.length() == 0) {
			throw new IllegalArgumentException(); // throwing Exception
		}
		return "My name is " + name;
	}

}
