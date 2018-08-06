package com.cg.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.spring.dao.IPaymentWalletDAO;
import com.cg.spring.dto.Customer;

@Service
public class PaymentWalletServiceImpl implements IPaymentWalletService {
	@Autowired
	private IPaymentWalletDAO dao;
	@Autowired
	static Customer account;
	int tId = (int) ((Math.random() * 123) + 999);

	@Override
	public float showBalance() {
		// TODO Auto-generated method stub
		return account.getCustomerBalance();
	}

	@Override
	public boolean depositAmount(float amount) {
		// TODO Auto-generated method stub
		account.setCustomerBalance(account.getCustomerBalance() + amount); // Depositing Amount
		String deposit = tId + "  Amount of " + amount + " is deposited:      " + account.getCustomerBalance();
		account.setTransaction(account.getTransaction() + "\n" + deposit);
		dao.save(account);
		return true;
	}

	@Override
	public boolean withdrawAmount(float amount) {
		// TODO Auto-generated method stub
		if (account.getCustomerBalance() >= (amount + 1000)) // Minimum Balance Check
		{
			account.setCustomerBalance(account.getCustomerBalance() - amount); // if true then withdraw.

			String with = tId + "  Amount of " + amount + " is withdrawn:     " + account.getCustomerBalance();
			account.setTransaction(account.getTransaction() + "\n" + with);
			dao.save(account);
			return true;
		} else {
			System.out.println("Minimum Balance Violation");
		}
		return false;
	}

	@Override
	public boolean loginAccount(String uName, String uPassword) {
		// TODO Auto-generated method stub
		account = dao.findById(uName).get();
		if (account != null) {

			return true;

		} else {
			return false;
		}
	}

	@Override
	public boolean fundTransfer(String uname, float amount) {
		// TODO Auto-generated method stub
		if (account.getCustomerBalance() < (amount + 1000)) {
			System.out.println("Minimum Balance Violation");
			return false;
		} else {
			Customer recvAccount = dao.findById(uname).get();
			account.setCustomerBalance(account.getCustomerBalance() - amount);

			String transfer = tId + "  Amount of " + amount + " is withdrawn from " + account.getCustomerAccountNo()
					+ " and deposited in" + recvAccount.getCustomerAccountNo();

			account.setTransaction(account.getTransaction() + "\n" + transfer);
			dao.save(account);
			recvAccount.setCustomerBalance(recvAccount.getCustomerBalance() + amount);
			dao.save(recvAccount);

			return true;
		}
	}

	@Override
	public String printTransaction() {
		// TODO Auto-generated method stub
		return account.getTransaction();
	}

	@Override
	public boolean addWalletDetails(Customer customer) {
		// TODO Auto-generated method stub
		dao.save(customer);
		return true;
	}

}
