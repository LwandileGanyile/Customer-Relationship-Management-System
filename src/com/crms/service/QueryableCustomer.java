package com.crms.service;

import java.util.LinkedHashSet;

import com.crms.model.Customer;

public interface QueryableCustomer {

	public abstract LinkedHashSet<Customer> retrieveCustomersInNameAscendingOrder();
	public abstract LinkedHashSet<Customer> retrieveCustomersInNameDescendingOrder();
	public abstract LinkedHashSet<Customer> retrieveCustomersInSurnameAscendingOrder();
	public abstract LinkedHashSet<Customer> retrieveCustomersInSurnameDescendingOrder();
	
	public abstract LinkedHashSet<Customer> retrieveEmailCustomers();
	public abstract LinkedHashSet<Customer> retrievePhoneCallCustomers();
	
	public abstract Customer findCustomer(String contact);
}
