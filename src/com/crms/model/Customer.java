package com.crms.model;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "CUSTOMER")

public class Customer implements Comparable<Customer>{

	// Primary Key
	@Id
	@Column(name = "CUSTOMER_CONTACT", nullable = false)
	private String contact;
	
	@OneToOne
	private Branch branch;
	
	@OneToOne
	private Address address;
	
	@Column(name = "CUSTOMER_NAME", nullable = false)
	private String name;
	
	@Column(name = "CUSTOMER_SURNAME", nullable = false)
	private String surname;
	
	@Column(name = "CUSTOMER_EMAIL", nullable = false)
	private String email;
	
	@Column(name = "CUSTOMER_ALT_CONTACT", nullable = false)
	private String anotherContact;
	
	@Column(name = "CUSTOMER_IMAGEPATH", nullable = false)
	private String imagePath;
	
	@Temporal(TemporalType.DATE)
	private Date joiningDate;
	
	@Column(name = "CUSTOMER_COMMUNICATION_CHOICE", nullable = false)
	private CommunicationMethod preferedMethod;
	
	public Date getJoiningDate() {
		return joiningDate;
	}

	public CommunicationMethod getPreferedMethod() {
		return preferedMethod;
	}

	public void setPreferedMethod(CommunicationMethod preferedMethod) {
		this.preferedMethod = preferedMethod;
	}

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	public Customer()
	{
		name = "Lwandile";
		surname = "Ganyile";
		email = "ganyile@yahoo.com";
		contact = "0717572711";
		anotherContact = "0823784726";
		imagePath = "C:\\Users\\Test\\Pictures\\Pics\\n8.jpg";
		
		joiningDate = new Date();
	
		preferedMethod = CommunicationMethod.EMAIL;
	}
	
	public Customer(String name, String surname, String email,
	String contact, String anotherContact, CommunicationMethod preferedMethod,
	String imagePath)
	{
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.contact = contact;
		this.anotherContact = anotherContact;
		this.preferedMethod = preferedMethod;
		this.imagePath = imagePath;
		joiningDate = new Date();
	
	}
	
	public Customer(String name, String surname, String email, String contact,
	String anotherContact, CommunicationMethod preferedMethod, String imagePath, 
	Branch branch, Address address)
	{
		this(name, surname, email, contact,
	    anotherContact, preferedMethod, imagePath);	
		joiningDate = new Date();
	}
	
	public CommunicationMethod isEmailPrefered() {
		return preferedMethod;
	}

	public void setEmailPrefered(CommunicationMethod preferedMethod) {
		this.preferedMethod = preferedMethod;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getAnotherContact() {
		return anotherContact;
	}

	public void setAnotherContact(String anotherContact) {
		this.anotherContact = anotherContact;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public Date getDate() {
		return joiningDate;
	}

	@Override
	public int compareTo(Customer person) {
		
		return name.compareTo(person.getName());
	}
	
	@Override
	public boolean equals(Object object) {
		
		Customer customer = (Customer)(object);
		return (contact.equals(customer.getContact()) && 
				address.equals(customer.getAddress()) &&
				branch.equals(customer.getBranch()) &&
				joiningDate.equals(customer.getJoiningDate()) &&
				name.equals(customer.getName()) &&
				surname.equals(customer.getSurname()) &&
				email.equals(customer.getEmail()) &&
				anotherContact.equals(customer.getAnotherContact()) &&
				preferedMethod==customer.getPreferedMethod());
	}

}
