package com.crms.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "MANAGER")
@DiscriminatorValue( value = "M" )
public class Manager extends Viewer{

	
	public Manager()
	{
		super();
	}
	
	public Manager(String username,String password)
	{
		super(username,password);
		
	}
	
	public String getViwerId() {
		return viewerId;
	}


	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
