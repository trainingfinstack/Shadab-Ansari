package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;



public interface CustomerRepository extends JpaRepository<Customer, Long> {

    List<Customer> findByActive(boolean isActive);

    Optional<Customer> findByAccountIdAndActive(Long accountId, boolean isActive);

    Optional<Customer> findByIdAndActive(Long id, boolean isActive);

}

