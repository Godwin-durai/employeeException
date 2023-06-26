package com.onesofts.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.onesofts.customer.dao.CustomerDao;
import com.onesofts.customer.entity.Customer;

@Service
public class CustomerService {
	@Autowired
	CustomerDao customerDao;

	public String addBankDetails(List<Customer> c) {
		return customerDao.addBankDetails(c);

	}

}
