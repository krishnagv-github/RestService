package trng.samp.rest.services;

import trng.samp.rest.pojo.Orders;
import trng.samp.rest.pojo.Customers;
import trng.samp.rest.pojo.OrderItems;

public interface OrderServiceInt {
	
	public boolean createOrder(Orders order);
	public boolean updateOrder(Orders order);
	public boolean deleteOrder(Long orderID);
	public Orders getOrder(Long orderID);

}
