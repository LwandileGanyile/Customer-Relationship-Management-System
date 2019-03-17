package com.crms.service;

import java.util.LinkedHashSet;

import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import com.crms.model.Customer;

@Transactional
public class CustomerDAOService extends DAOService implements QueryableCustomer, Customerable{

	@PersistenceContext
	private LinkedHashSet<Customer> customers;
	
	public CustomerDAOService() {
		
		customers = new LinkedHashSet<Customer>();
	}
	
	@Override
	public void insertCustomer(Customer customer) {
		
		entityManager.persist(customer.getAddress());
		entityManager.persist(customer.getBranch());
		entityManager.persist(customer);
		//finalizeTransaction();
		
	}
	
	@Override
	public Customer findCustomer(String contact) {
		
		return entityManager.
				find( Customer.class, contact );
		
	}
	
	@Override
	public void deleteCustomer(String contact) {
		
		Customer customer = entityManager.
				find( Customer.class, contact );
		entityManager.remove(customer);
		finalizeTransaction();
		
	}
	
	@Override
	public LinkedHashSet<Customer> retrieveCustomersInNameAscendingOrder() {
		
		String stringQuery =  "SELECT C FROM CUSTOMER C ORDER BY C.CUSTOMER_NAME ASC";
		dealWithQuery(stringQuery,customers);
		return customers;
	}

	@Override
	public LinkedHashSet<Customer> retrieveCustomersInNameDescendingOrder() {
		
		String stringQuery =  "SELECT C FROM CUSTOMER C ORDER BY C.CUSTOMER_NAME DESC";
		dealWithQuery(stringQuery,customers);
		return customers;
	}


	@Override
	public LinkedHashSet<Customer> retrieveCustomersInSurnameAscendingOrder() {
		
		String stringQuery =  "SELECT C FROM CUSTOMER C ORDER BY C.CUSTOMER_SURNAME ASC";
		dealWithQuery(stringQuery,customers);
		return customers;
	}


	@Override
	public LinkedHashSet<Customer> retrieveCustomersInSurnameDescendingOrder() {
		
		String stringQuery =  "SELECT C FROM CUSTOMER C ORDER BY C.CUSTOMER_SURNAME DESC";
		dealWithQuery(stringQuery,customers);
		return customers;
	}


	@Override
	public LinkedHashSet<Customer> retrieveEmailCustomers() {
		
		String stringQuery =  
							"SELECT C FROM CUSTOMER C WHERE C.CUSTOMER_COMMUNICATION_CHOICE=EMAIL";
		dealWithQuery(stringQuery,customers);
		return customers;
	}


	@Override
	public LinkedHashSet<Customer> retrievePhoneCallCustomers() {
		
		String stringQuery =  
				"SELECT * FROM CUSTOMER C WHERE C.CUSTOMER_COMMUNICATION_CHOICE=PHONE_CALL";
		dealWithQuery(stringQuery,customers);
		return customers;
	}

}
