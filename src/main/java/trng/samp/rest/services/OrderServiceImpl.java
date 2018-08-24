package trng.samp.rest.services;

import trng.samp.rest.dao.OrderDaoImpl;
import trng.samp.rest.pojo.Orders;

public class OrderServiceImpl implements OrderServiceInt {
	
	OrderDaoImpl odi = new OrderDaoImpl();

	@Override
	public boolean createOrder(Orders order) {
		odi.createOrder(order);
		return true;
	}

	@Override
	public boolean updateOrder(Orders order) {
		odi.updateOrder(order);
		return true;
	}

	@Override
	public boolean deleteOrder(Long orderID) {
		odi.deleteOrder(orderID);
		return false;
	}

	@Override
	public Orders getOrder(Long orderID) {
		Orders order = odi.getOrder(orderID);
		return order;
	}

}
