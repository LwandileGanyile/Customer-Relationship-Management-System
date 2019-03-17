package com.crms.service;

import java.util.LinkedHashSet;

import com.crms.model.Customer;
import com.crms.model.Manager;

public class ManagerDAOService extends DAOService implements QueryableCustomer{
	
	private CustomerDAOService daoService;
	
	public ManagerDAOService() {
		
		super();
		daoService = new CustomerDAOService();
	}

	public void insertManager(Manager manager) {
		
		entityManager.persist(manager);
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
