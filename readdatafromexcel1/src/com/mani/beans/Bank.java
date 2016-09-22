package com.mani.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Bankdetails",schema="anno")
public class Bank{
	@Id
	@Column
	private int bankid;
	@Column
	private String Fname;
	@Column
	private String Lname;
	@Column
	private String BankName;
	@Column
	private String accountNumber;
	@Column
	private String ifscCode;
	@Column
	private String location;
	
	
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
	public int getBankid() {
		return bankid;
	}
	public void setBankid(int bankid) {
		this.bankid = bankid;
	}
	public String getBankName() {
		return BankName;
	}
	public void setBankName(String bankName) {
		BankName = bankName;
	}
	public Bank() {
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Bank(String accountNumber, String ifscCode, String location) {
		super();
		this.accountNumber = accountNumber;
		this.ifscCode = ifscCode;
		this.location = location;
	}

}
