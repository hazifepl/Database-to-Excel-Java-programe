package com.mani.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Address" ,schema="anno")
public class Address {
	@Id
	private int addressId;
	@Column
	private String DoorNo;
	@Column
	private String Street;
	@Column
	private String District;
	@Column
	private String state;
	@Column
	private String country;
	public Address() {
	}
	
	public Address(int addressId, String doorNo, String street, String district, String state, String country) {
		super();
		this.addressId = addressId;
		DoorNo = doorNo;
		Street = street;
		District = district;
		this.state = state;
		this.country = country;
	}

	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getDoorNo() {
		return DoorNo;
	}
	public void setDoorNo(String doorNo) {
		DoorNo = doorNo;
	}
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	public String getDistrict() {
		return District;
	}
	public void setDistrict(String district) {
		District = district;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
}
