package com.suraj.order.impl;

import static org.junit.Assert.assertTrue;
//these provides some imp static things like when used below
import static org.mockito.Mockito.when;

import java.sql.SQLException;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;



import com.suraj.order.bo.exception.BOException;
import com.suraj.order.dao.OrderDAO;
import com.suraj.order.dto.Order;

//dumbness of the version change I am not able to check and apply new changes and so we have errors here

@ExtendWith(MockitoExtension.class)
public class OrderBOImplTest {

	@Mock   /*this is used to mock the object*/
	OrderDAO dao;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this); /*this is used to initalize the mocks*/
	}

	@Test
	public void placeOrder_Should_Create_An_Order_test() throws SQLException, BOException {
		OrderBOImpl bo = new OrderBOImpl();
		bo.setDao(dao);
		
		Order order = new Order();
		when(dao.create(order)).thenReturn(Integer.valueOf(1)); //new Integer(1)  is depricated so 
		/*when().... thenReturn() are expectations */
		
		boolean result = bo.placeOrder(order);
		
		
		assertTrue(result);
	}

}
