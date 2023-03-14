package com.example.demo;

import java.util.List;

public interface CustomerService {

    Customer addCustomer(Customer customer);

    List<Customer> getActiveCustomers();

    List<Customer> getInactiveCustomers();

    Customer getCustomerByAccountIdAndActiveStatus(Long accountId, boolean isActive);

    void deleteCustomer(Long id);

	

}

