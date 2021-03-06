package trng.samp.rest.controllers;

import org.springframework.stereotype.Controller;
import trng.samp.rest.pojo.Customers;
import trng.samp.rest.services.CustomerServiceInt;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/Customers")
public class CustomerController {

	@Autowired
	CustomerServiceInt csi;

	Customers cust = new Customers();

	// Test Handler
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		return "index";
	}

	@RequestMapping(value = "/{custID}", method = RequestMethod.GET)
	public Customers loadCustomer(@PathVariable("custID") long id) {
		return csi.loadCustomer(id);
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public ResponseEntity<?> addCustomer(@RequestBody Customers cust) {
		boolean status = csi.addCustomer(cust);
		return status ? new ResponseEntity<>(HttpStatus.CREATED) : new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	}

	@RequestMapping(value = "/", method = RequestMethod.PUT)
	public ResponseEntity<?> updateCustomer(@RequestBody Customers cust) {
		boolean status = csi.updateCustomer(cust);
		return status ? new ResponseEntity<>(HttpStatus.OK) : new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
	}

	@RequestMapping(value = "/{custID}", method = RequestMethod.DELETE)
	public boolean deleteCustomer(@PathVariable("custID") long id) {
		return csi.deleteCustomerByHql(id);
	}
	
	@RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ResponseEntity<?> getCustomers() {
		long custID = 2;
		List<Customers> customers = (List<Customers>) csi.loadCustomer(custID);
		return new ResponseEntity<>(customers, HttpStatus.OK);
	}

}
