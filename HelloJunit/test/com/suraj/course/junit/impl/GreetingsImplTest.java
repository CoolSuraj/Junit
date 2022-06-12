package com.suraj.course.junit.impl;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

import com.suraj.course.junit.interfaces.Greetings;

class GreetingsImplTest {

	@Test
	void sayHelloProperly() {  //Test for sayHello
//		fail("Not yet implemented");   //this is to fail
		Greetings greeting = new GreetingsImpl();
		String greet = greeting.sayHello("Abhi");
		assertNotNull(greet);
		assertEquals("My name is Abhi", greet);
		//assertNotEquals("Abhi", greet);
	}

}
