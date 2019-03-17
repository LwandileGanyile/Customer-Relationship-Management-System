package com.crms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "BRANCH")
public class Branch{

	// Primary key of the Branch table.
	@Id
	@GeneratedValue
	@Column(name = "BRANCH_CODE")
	private int branchCode;
	
	@Column(name = "BRANCH_NAME", nullable = false)
	private String branchName;
	
	@OneToOne
	private Address address;
	
	public Branch() {
		
		branchName = "West Street";
		branchCode = 4124;
	}
	
	public Branch(String branchName, int code, Address address) {
		this.branchName = branchName;
		this.branchCode = code;
		this.address = address;
	}

	public int getBranchCode() {
		return branchCode;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}



	public Branch(String branchProvince, String branchCity, String branchStreetName,int branchPostalCode,String branchName, int branchCode) {
		
		this(branchName,branchCode,new Address(branchProvince,branchCity,
				branchStreetName, branchPostalCode));
	}

	public String getName() {
		return branchName;
	}

	public int getCode() {
		return branchCode;
	}
}
