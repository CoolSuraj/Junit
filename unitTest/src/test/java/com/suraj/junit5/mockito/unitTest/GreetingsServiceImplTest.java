package com.suraj.junit5.mockito.unitTest;

import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class GreetingsServiceImplTest {
	
	@Mock  //this is like autowiring
	private GreetingService service;
	
	@InjectMocks  //as above thing is also used in Greetings below we need to inject above mocked object in this
	private GreetingsImpl greeting;
	
	@Test
	public void sayHelloProperly() {
		System.out.println("Greeting is proper scenario");
		when(service.sayHello("suraj")).thenReturn("My name is suraj");
		String result = greeting.sayHello("suraj");
		Assertions.assertNotNull(result);
		Assertions.assertEquals("My name is suraj",result);
	}
	
	@Test
	public void sayHelloProperlyShouldThrowException() {
		System.out.println("Greeting is bad should throw Name is null");
		doThrow(IllegalArgumentException.class).when(service).sayHello(null);
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			greeting.sayHello(null);
		});
	}
	
	@Test
	public void sayHelloProperlyShouldThrowifNameBlankException() {
		System.out.println("Greeting is bad should throw Name is blank");
		doThrow(IllegalArgumentException.class).when(service).sayHello("");
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
			greeting.sayHello("");
		});
	}

	

}
