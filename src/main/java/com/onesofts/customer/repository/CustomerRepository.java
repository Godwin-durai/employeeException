package com.onesofts.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onesofts.customer.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
