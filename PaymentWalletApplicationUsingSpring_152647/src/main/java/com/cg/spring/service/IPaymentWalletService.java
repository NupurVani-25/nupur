package com.cg.spring.service;

import com.cg.spring.dto.Customer;

public interface IPaymentWalletService {

	public float showBalance();

	public boolean depositAmount(float amount);

	public boolean withdrawAmount(float amount);

	public boolean loginAccount(String uName, String uPassword);

	public boolean fundTransfer(String uname, float amount);

	public String printTransaction();

	public boolean addWalletDetails(Customer customer);
}
