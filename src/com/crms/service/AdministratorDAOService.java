package com.crms.service;

import java.util.LinkedHashSet;

import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import com.crms.model.Administrator;
import com.crms.model.Customer;

@Transactional
public class AdministratorDAOService extends DAOService implements QueryableCustomer{
	
	// @PersistenceContext
	private CustomerDAOService daoService;
	
	@PersistenceContext
	private Administrator administrator;
	


	public AdministratorDAOService() {
		
		super();
		daoService = new CustomerDAOService();
		administrator = new Administrator();
		
	}
	
	public AdministratorDAOService(Administrator administrator, CustomerDAOService daoService) {
		
		this.daoService = daoService;
		this.administrator = administrator;
		
	}
	
	
	public void insertAdministrator(Administrator administrator) {
		
		entityManager.persist(administrator);
		//finalizeTransaction();
	}
	
	public CustomerDAOService getDaoService() {
		return daoService;
	}

	public Administrator getAdministrator() {
		return administrator;
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
