package com.onesofts.customer.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="customerCall")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String branch;
private int accountNumber;
private String ifsc;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getBranch() {
	return branch;
}
public void setBranch(String branch) {
	this.branch = branch;
}
public int getAccountNumber() {
	return accountNumber;
}
public void setAccountNumber(int accountNumber) {
	this.accountNumber = accountNumber;
}
public String getIfsc() {
	return ifsc;
}
public void setIfsc(String ifsc) {
	this.ifsc = ifsc;
}

}
