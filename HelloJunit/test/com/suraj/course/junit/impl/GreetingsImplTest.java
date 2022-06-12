package com.suraj.course.junit.impl;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.suraj.course.junit.interfaces.Greetings;

class GreetingsImplTest {
	
	Greetings greeting;
	
	@BeforeEach   //this is used as configuration before each method
	public void setup() {
		greeting = new GreetingsImpl();//this will be used for 2
		System.out.println("setup");
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

////	@Test(expected = IllegalArgumentException.class)  //this was Junit5 way
//	public void greetShouldThrowExceptionForNullVal() {
//			greeting.sayHello(null);//show throw Exception
//	}
	@Test
	public void sayHelloProperly2() { // Test for sayHello
//		fail("Not yet implemented");   //this is to fail
		String greet = greeting.sayHello("Abhi");
		assertNotNull(greet);
		assertEquals("My name is Abhi", greet);
		// assertNotEquals("Abhi", greet);
	}
	
	@AfterEach
	public void teardown() {
		greeting =null;
		System.out.println("end");
		//will be done after each method
	}

}
