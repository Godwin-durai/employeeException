package com.onesofts.customer.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.onesofts.customer.entity.Customer;
import com.onesofts.customer.repository.CustomerRepository;

@Repository
public class CustomerDao {
	@Autowired
	CustomerRepository customerRepo;
	public String addBankDetails(List<Customer>c) {
   customerRepo.saveAll(c);
   return "Sucessfully saved";

}
}