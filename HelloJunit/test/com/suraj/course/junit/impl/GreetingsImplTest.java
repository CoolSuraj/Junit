package com.suraj.course.junit.impl;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

import com.suraj.course.junit.interfaces.Greetings;

class GreetingsImplTest {
	
	private Greetings greeting;
	@Before
	public void setup() {
		greeting = new GreetingsImpl();//this will be used for 2
		//executed before each method
	}

	@Test
	public void sayHelloProperly() { // Test for sayHello
//		fail("Not yet implemented");   //this is to fail
		String greet = greeting.sayHello("Abhi");
		assertNotNull(greet);
		assertEquals("My name is Abhi", greet);
		// assertNotEquals("Abhi", greet);
	}
//    @Rule
//    public ExpectedException expectation = ExpectedException.none();

//	@Test(expected = IllegalArgumentException.class)  //this was Junit5 way
	public void greetShouldThrowExceptionForNullVal() {
			greeting.sayHello(null);//show throw Exception
	}
	
	@After
	public void teardown() {
		greeting =null;
		//will be done after each method
	}

}
