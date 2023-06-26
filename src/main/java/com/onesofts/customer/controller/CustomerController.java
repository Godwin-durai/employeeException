package com.onesofts.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.onesofts.customer.entity.Customer;
import com.onesofts.customer.service.CustomerService;

@RestController
public class CustomerController {
	@Autowired
	CustomerService customerSer;
	@PostMapping(value="/addCustomerDetail")
	public String addCustomerDetails(@RequestBody List<Customer>c) {
		return customerSer.addBankDetails(c);
	}
	

}
