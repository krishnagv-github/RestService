package trng.samp.rest.dao;

import trng.samp.rest.pojo.Orders;
import trng.samp.rest.pojo.Customers;
import trng.samp.rest.pojo.OrderItems;

public interface CustDaoInt {
	
	public boolean addCustomer(Customers cust);
	public boolean deleteCustomerByHql(Long custID);
	public boolean deleteCustomer(Long custID);
	public boolean updateCustomer(Customers cust);
	public Customers loadCustomer(Long custID);

}
