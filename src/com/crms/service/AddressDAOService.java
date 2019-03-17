package com.crms.service;

import java.util.LinkedHashSet;

import com.crms.model.Address;

public class AddressDAOService extends DAOService{

private LinkedHashSet<Address> addresses;
	
	public AddressDAOService() {
		
		addresses = new LinkedHashSet<Address>();
	}
	
	public LinkedHashSet<Address> getAdministrators() {
		return addresses;
	}

	public void insertAddress(Address address) {
		
		entityManager.persist(address);
		finalizeTransaction();
	}
	
	public Address findAddress(int identifier) {
		
		return entityManager.
				find( Address.class, identifier );
	}


	public void deleteAddress(int identifier) {
		
		Address address = entityManager.
				find( Address.class, identifier );
		entityManager.remove(address);
		finalizeTransaction();
	}
	
	public LinkedHashSet<Address> retrieveProvinceAddresses(String provinceName){
		
		String stringQuery =  
				"SELECT A FROM ADDRESS A WHERE A.PROVINCE_OF_ADDRESS= "+provinceName;
		dealWithQuery(stringQuery,addresses);
		return addresses;
	}
	
	public LinkedHashSet<Address> retrieveCityAddresses(String city){
		
		String stringQuery =  
				"SELECT A FROM ADDRESS A WHERE A.CITY_OF_ADDRESS= "+city;
		dealWithQuery(stringQuery,addresses);
		return addresses;
	}
}
