package com.suraj.junit5.mockito.unitTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import com.suraj.junit5.mockito.interfaces.Greetings;

@ExtendWith(MockitoExtension.class)
public class GreetingsImplTest {
	
	@Mock  //this is like autowiring
	private GreetingService service;
	
	@InjectMocks  //as above thing is also used in Greetings below we need to inject above mocked object in this
	private Greetings greeting;
	
	

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
