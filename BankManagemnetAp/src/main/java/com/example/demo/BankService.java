package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.apache.el.stream.Optional;
import org.springframework.stereotype.Service;

@Service
public class BankService {
	 private List<Customer> customers = new ArrayList<>();
	    
	    public Customer addCustomer(Customer customer) {
	        // Generate random account ID with 8 digits
	        String accountId = String.format("%08d", new Random().nextInt(100000000));
	        customer.setAccountId(accountId);
	        customer.setActive(true);
	        customers.add(customer);
	        System.out.println("customer register succesfully");
	        return customer;
	    }
	    
	    public List<Customer> getAllCustomers() {
	        return customers;
	    }
	    public List<Customer> getActiveCustomers() {
	        List<Customer> activeCustomers = new ArrayList<>();
	        for (Customer customer : customers) {
	            if (customer.isActive()) {
	                activeCustomers.add(customer);
	            }
	        }
	        return activeCustomers;
	    }
	    public List<Customer> getInactiveCustomers() {
	        List<Customer> inactiveCustomers = new ArrayList<>();
	        for (Customer customer : customers) {
	            if (!customer.isActive()) {
	                inactiveCustomers.add(customer);
	            }
	        }
	        return inactiveCustomers;
	    }
	    public void deleteCustomer(String id) {

	        for(Customer customer : customers){
	            if(customer.getId().equals(id)){
	                if(!customer.isActive()){
	                    customers.remove(customer);
	                }
	            }
	        }
	    }
	    
}