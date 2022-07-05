package com.suraj.order.impl;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import com.suraj.order.dao.OrderDAO;

class OrderBOImplTest {

	@Mock
	OrderDAO dao;

	@Test
	public void placeOrder_Should_Create_An_Order_test() {
		OrderBOImpl bo = new OrderBOImpl();
		bo.setDao(dao);
	}

}
