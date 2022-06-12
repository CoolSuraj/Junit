package com.suraj.course.junit.impl;

import com.suraj.course.junit.interfaces.Greetings;

public class GreetingsImpl implements Greetings{

	@Override
	public String sayHello(String name) {
		return "My name is "+name;
	}

}
