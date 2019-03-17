package com.crms.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table
//@Inheritance( strategy = InheritanceType.SINGLE_TABLE )
@DiscriminatorColumn( name="type" )
public class Viewer {

	// Primary Key
		@Id
		@GeneratedValue
		@Column(name = "VIEWER_ID")
		protected String viewerId;
		
		@Column(name = "USERNAME", nullable = false)
		protected String username;
		
		
		@Column(name = "PASSWORD", nullable = false)
		protected String password;
		
		protected Viewer() {
			
			username = "ganyile@yahoo.com";
			password = "qwerty321";
		}
		
		protected Viewer(String username, String password) {
			this.username = username;
			this.password= password;
		}

		public String getViewerId() {
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
