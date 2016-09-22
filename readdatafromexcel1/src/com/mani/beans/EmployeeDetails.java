package com.mani.beans;
import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="employeedetails" , schema="anno")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class EmployeeDetails {
	@javax.persistence.Id
	private int Id;
	@Column
	private String Fname;
	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}

	@Column
	private String Lname;
	@Column
	private Date Dob;
	@Column
	private String Designation;
	@Column
	private String EmpStatus;
	@Column
	private String PhoneNumber;
	@Column
	private String Emai_Id;
	@Column
	private byte[] image;
	@OneToOne(cascade= CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="addressId")
	private Address address;
	@OneToOne(cascade= CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="bankid")
	private Bank bank;
	public EmployeeDetails() {
		
	}
	
	public String getEmpStatus() {
		return EmpStatus;
	}

	public void setEmpStatus(String empStatus) {
		EmpStatus = empStatus;
	}

	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	public Date getDob() {
		return Dob;
	}
	public void setDob(Date dob) {
		Dob = dob;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	public String getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	public String getEmai_Id() {
		return Emai_Id;
	}
	public void setEmai_Id(String emai_Id) {
		Emai_Id = emai_Id;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

	public EmployeeDetails(int id, String fname, String lname, Date dob, String designation, String empStatus,
			String phoneNumber, String emai_Id, byte[] image, Address address) {
		super();
		Id = id;
		Fname = fname;
		Lname = lname;
		Dob = dob;
		Designation = designation;
		EmpStatus = empStatus;
		PhoneNumber = phoneNumber;
		Emai_Id = emai_Id;
		this.image = image;
		this.address = address;
	}
	

}
