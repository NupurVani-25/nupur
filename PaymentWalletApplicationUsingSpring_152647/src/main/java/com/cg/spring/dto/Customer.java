package com.cg.spring.dto;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer implements Serializable {
	private static final long serialVersionUID = 1L;
	@Column(length = 12)
	private String aadharNo;
	@Column(length = 20)
	private String customerName;
	@Column(length = 2)
	private int age;
	@Column(length = 6)
	private String gender;
	@Column(length = 10)
	private String customerMobileNo;
	@Column(length = 20)
	private String customerEmail;
	@Id
	@Column(length = 20)
	private String userName;
	@Column(length = 20)
	private String userPassword;
	@Column(length = 50)
	private float customerBalance;
	@Column(length = 20)
	private int customerAccountNo;
	@Column(length = 20)
	private LocalDate customerAccountDate;
	@Lob
	private String transaction;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(String aadharNo, String customerName, int age, String gender, String customerMobileNo,
			String customerEmail, String userName, String userPassword, float customerBalance, int customerAccountNo,
			LocalDate customerAccountDate, String transaction) {
		super();
		this.aadharNo = aadharNo;
		this.customerName = customerName;
		this.age = age;
		this.gender = gender;
		this.customerMobileNo = customerMobileNo;
		this.customerEmail = customerEmail;
		this.userName = userName;
		this.userPassword = userPassword;
		this.customerBalance = customerBalance;
		this.customerAccountNo = customerAccountNo;
		this.customerAccountDate = customerAccountDate;
		this.transaction = transaction;
	}

	public String getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCustomerMobileNo() {
		return customerMobileNo;
	}

	public void setCustomerMobileNo(String customerMobileNo) {
		this.customerMobileNo = customerMobileNo;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public float getCustomerBalance() {
		return customerBalance;
	}

	public void setCustomerBalance(float customerBalance) {
		this.customerBalance = customerBalance;
	}

	public int getCustomerAccountNo() {
		return customerAccountNo;
	}

	public void setCustomerAccountNo(int customerAccountNo) {
		this.customerAccountNo = customerAccountNo;
	}

	public LocalDate getCustomerAccountDate() {
		return customerAccountDate;
	}

	public void setCustomerAccountDate(LocalDate customerAccountDate) {
		this.customerAccountDate = customerAccountDate;
	}

	public String getTransaction() {
		return transaction;
	}

	public void setTransaction(String transaction) {
		this.transaction = transaction;
	}

}
