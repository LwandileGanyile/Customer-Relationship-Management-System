package com.crms.service;

import java.util.LinkedHashSet;

import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import com.crms.model.Branch;

@Transactional
public class BranchDAOService extends DAOService{

	@PersistenceContext
	private LinkedHashSet<Branch> branches;
	
	public BranchDAOService() {
		
		branches = new LinkedHashSet<Branch>();
	}
	
	public LinkedHashSet<Branch> getBranches() {
		return branches;
	}

	public void insertBranch(Branch branch) {
		
		entityManager.persist(branch.getAddress());
		entityManager.persist(branch);
		finalizeTransaction();
	}
	
	public Branch findBranch(int identifier) {
		
		return entityManager.
				find( Branch.class, identifier );
	}


	public void deleteBranch(int identifier) {
		
		Branch branch = entityManager.
				find( Branch.class, identifier );
		entityManager.remove(branch);
		finalizeTransaction();
	}
}
