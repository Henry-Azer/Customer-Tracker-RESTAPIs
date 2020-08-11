package crm.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import crm.entity.Customer;
import crm.exception.CustomerNotFoundException;
import crm.service.CustomerService;

@RestController
@RequestMapping("/api")
public class CRMRestController {
	
	@Autowired
	private CustomerService customerService;
	
	// get list of all customers
	@GetMapping("/customers")
	public List<Customer> getCustomers() {
		return customerService.getCustomers();
	}
	
	// get specific customer using id
	@GetMapping("/customers/{customerId}")
	public Customer getCustomer(@PathVariable int customerId) {
		
		Customer customer = customerService.getCustomer(customerId);
		
		if(customer == null)
			throw new CustomerNotFoundException("Customer id not found - " + customerId );
		
		return customer;
	}
	
	@PostMapping("/customers")
	public Customer addCustomer(@RequestBody Customer customer) {
		
		customer.setId(0);
		customerService.saveCustomer(customer);
		
		return customer;
		
	}
	
	@PutMapping("/customers")
	public Customer updateCustomer(@RequestBody Customer customer) {
		
		customerService.saveCustomer(customer);
		
		return customer;
		
	}
	
	@DeleteMapping("/customers/{customerId}")
	public String deleteCustomer(@PathVariable int customerId) {
		
		customerService.deleteCustomer(customerId);
		
		return "Customer Deleted id = " + customerId;
		
	}
}









