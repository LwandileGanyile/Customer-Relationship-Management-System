package com.crms.service;

import com.crms.model.Customer;

public interface Customerable {

	public void insertCustomer(Customer customer);
	public void deleteCustomer(String identifier);
}
