package com.crms.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ADDRESS")
public class Address{
	
	// Primary Key for the Address table.
	@Id
	@GeneratedValue()
	@Column(name = "ID_OF_ADDRESS")
	private int addressId;

	@Column(name = "PROVINCE_OF_ADDRESS", nullable = false)
	private String province;
	
	@Column(name = "CITY_OF_ADDRESS", nullable = false)
	private String city;
	
	@Column(name = "STREET_OF_ADDRESS", nullable = false)
	private String streetName;
	
	@Column(name = "POSTALCODE_OF_ADDRESS", nullable = false)
	private int postalCode;
	
	
	public Address()
	{
		this("Kwa Zulu Natal","Durban","Ashwell Road",4091);
	}
	
	public Address(String province,String city,
			String streetName, int postalCode)
	{
				this.streetName = streetName;
				this.province = province;
				this.city = city;
				this.postalCode = postalCode;
			
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}


	public String getProvince() {
		return province;
	}

	public String getCity() {
		return city;
	}

	public String getStreetName() {
		return streetName;
	}

	public int getPostalCode() {
		return postalCode;
	}
	
	public int getAddressId() {
		
		return addressId;
	}
	
	
	public boolean areSimilar(Address address) {
		
		return(addressId==address.getAddressId() && postalCode==address.getPostalCode()
		  && streetName.equals(address.getStreetName()) && city.equals(address.getCity())
		  && province.equals(address.getProvince()));
	}
	
	@Override
	public boolean equals(Object object) {
		
		
		Address newAddress = (Address)(object);
		
		return(addressId==newAddress.getAddressId() && postalCode==newAddress.getPostalCode()
		  && streetName.equals(newAddress.getStreetName()) && city.equals(newAddress.getCity())
		  && province.equals(newAddress.getProvince()));
	}
}

