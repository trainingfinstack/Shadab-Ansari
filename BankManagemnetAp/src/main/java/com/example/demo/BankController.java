package com.example.demo;

import java.util.List;

import org.apache.el.stream.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController {
	 @Autowired
	    private BankService bankService;
	    
	    @PostMapping("/customer")
	    public Customer addCustomer(@RequestBody Customer customer) {
	        return bankService.addCustomer(customer);
	    }
	    
	    @GetMapping("/customers")
	    public List<Customer> getAllCustomers() {
	        return bankService.getAllCustomers();
	    }
	    @GetMapping("customer/active")
	    public List<Customer>  getActiveCustomers(){
	    	return bankService. getActiveCustomers();
	    }
	    @GetMapping("customer/inactive")
	    public List<Customer> getInactiveCustomers(){
	    	return bankService.getInactiveCustomers();
	    }
	    @RequestMapping(method = RequestMethod.DELETE,value="/customer/{id}")
	    public void deleteCustomer(@PathVariable String id)
	    {
	         bankService.deleteCustomer(id);
	    }

}