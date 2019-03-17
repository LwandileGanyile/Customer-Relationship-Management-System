package com.crms.service;

import java.util.LinkedHashSet;

import com.crms.model.Administrator;
import com.crms.model.Customer;

public class AdministratorDAOService extends DAOService implements QueryableCustomer{
	
	private CustomerDAOService daoService;
	
	public AdministratorDAOService() {
		
		super();
		daoService = new CustomerDAOService();
		
	}
	
	public void insertAdministrator(Administrator administrator) {
		
		entityManager.persist(administrator);
		finalizeTransaction();
	}

	@Override
	public LinkedHashSet<Customer> retrieveCustomersInNameAscendingOrder() {
		
		return daoService.retrieveCustomersInNameAscendingOrder();
	}

	@Override
	public LinkedHashSet<Customer> retrieveCustomersInNameDescendingOrder() {
		
		return daoService.retrieveCustomersInNameDescendingOrder();
	}

	@Override
	public LinkedHashSet<Customer> retrieveCustomersInSurnameAscendingOrder() {
		
		return daoService.retrieveCustomersInSurnameAscendingOrder();
	}

	@Override
	public LinkedHashSet<Customer> retrieveCustomersInSurnameDescendingOrder() {
		
		return daoService.retrieveCustomersInSurnameDescendingOrder();
	}

	@Override
	public LinkedHashSet<Customer> retrieveEmailCustomers() {
		
		return daoService.retrieveEmailCustomers();
	}

	@Override
	public LinkedHashSet<Customer> retrievePhoneCallCustomers() {
		
		return daoService.retrievePhoneCallCustomers();
	}

	@Override
	public Customer findCustomer(String contact) {
		
		return findCustomer(contact);
	}
	
}
