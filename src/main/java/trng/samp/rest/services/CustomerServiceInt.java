package trng.samp.rest.services;

import trng.samp.rest.pojo.*;

public interface CustomerServiceInt {
	
	public boolean addCustomer(Customers cust);
	public boolean deleteCustomerByHql(Long custID);
	public boolean deleteCustomer(Long custID);
	public boolean updateCustomer(Customers cust);
	public Customers loadCustomer(Long custID);

}
