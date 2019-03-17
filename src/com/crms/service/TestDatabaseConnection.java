package com.crms.service;

import com.crms.model.Address;

public class TestDatabaseConnection {

	public static void main(String[] args) {
		
		Address address = new Address();
		AddressDAOService dataAccessService = new AddressDAOService();
		dataAccessService.insertAddress(address);

	}

}
