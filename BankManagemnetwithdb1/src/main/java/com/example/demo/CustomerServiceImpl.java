package com.example.demo;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Customer addCustomer(Customer customer) {
        // Generate 8-digit account ID
        customer.setAccountId(ThreadLocalRandom.current().nextLong(10000000L, 99999999L));
        customer.setActive(true);
        return customerRepository.save(customer);
    }

    public List<Customer> getActiveCustomers() {
        return customerRepository.findByActive(true);
    }

    public List<Customer> getInactiveCustomers() {
        return customerRepository.findByActive(false);
    }

    
    public Customer getCustomerByAccountIdAndActiveStatus(Long accountId, boolean isActive) {
        Optional<Customer> optionalCustomer = customerRepository.findByAccountIdAndActive(accountId, isActive);
        return optionalCustomer.orElse(null);
    }


    public void deleteCustomer(Long id) {
        Optional<Customer> optionalCustomer = customerRepository.findByIdAndActive(id, false);
        if (optionalCustomer.isPresent()) {
            customerRepository.delete(optionalCustomer.get());
        } else {
            throw new IllegalArgumentException("Cannot delete an active customer or a customer that does not exist");
        }
    }
}
