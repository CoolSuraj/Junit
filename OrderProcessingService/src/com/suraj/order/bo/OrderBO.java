package com.suraj.order.bo;

import com.suraj.order.bo.exception.BOException;
import com.suraj.order.dto.Order;

public interface OrderBO {
	boolean placeOrder(Order order) throws BOException;
	boolean cancelOrder(int id) throws BOException;
	boolean deleteOrder(int id) throws BOException;
	
}
