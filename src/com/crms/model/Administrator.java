package com.crms.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ADMINISTRATOR")
@DiscriminatorValue( value = "A" )
public class Administrator extends Viewer{
	
	public Administrator() {
		
		username = "Lwandile";
		password = "xxxxx";
		
	}
	
	public Administrator(String username, String password) {
		
		this.username = username;
		this.password = password;
	
	}
	
	public String getViewerId() {
		return viewerId;
	}

	public void setViewerId(String viewerId) {
		this.viewerId = viewerId;
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
