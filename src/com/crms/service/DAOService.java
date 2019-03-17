package com.crms.service;

import java.util.LinkedHashSet;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class DAOService{

	protected EntityManagerFactory entityManagerFoctory;
	protected EntityManager entityManager;
	private Query query;

	protected DAOService() {
		
		entityManagerFoctory = Persistence.
		createEntityManagerFactory( "Hibernate_JPA" );
		entityManager = entityManagerFoctory.
				createEntityManager( );
		entityManager.getTransaction().begin( );
		
		
	}
	
	protected void finalizeTransaction() {
		entityManager.getTransaction( ).commit( );
		entityManager.close( );
		entityManagerFoctory.close( );
	}
	
	
	protected <E> void dealWithQuery(String stringQuery, LinkedHashSet<E> set) {
		
		query = entityManager.
				createQuery(stringQuery);
				List<E> list= (List<E>)(query.getResultList());
				
				if(list.size()>0)
					set.clear();
				
				for(E element:list)
					set.add(element);
	}
	
	
	
}
