package com.cg.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.spring.dto.Customer;
import com.cg.spring.exception.InsufficientBalanceException;
import com.cg.spring.service.IPaymentWalletService;

@RestController
public class CustomerController {
	@Autowired
	private IPaymentWalletService service;
	
	@RequestMapping(value = "/customer", method = RequestMethod.POST)
	public void addCustomer(@RequestBody Customer newCustomer) {
		service.addWalletDetails(newCustomer);
	}
	@RequestMapping(value = "/customer/{mobileNumber}/print")
	public String printTransaction(@PathVariable String mobileNumber) {
		return service.printTransaction();
}
	@RequestMapping(value = "/customer/{mobileNumber}/deposit/{depositableAmount}", method = RequestMethod.PUT)
	public void depositMoney(@PathVariable String mobileNumber, @PathVariable Float depositableAmount) {
		service.depositAmount(depositableAmount);
	}
	@RequestMapping(value = "/customer/{mobileNumber}/withdraw/{withdrawableAmount}", method = RequestMethod.PUT)
	public void withdrawMoney(@PathVariable String mobileNumber,@PathVariable Float withdrawableAmount) {
		service.withdrawAmount(withdrawableAmount);
	}
	@RequestMapping(value = "/customer/{SmobileNumber}/{RecmobileNumber}/{transferableAmount}", method = RequestMethod.PUT)
	public void fundTransfer(@PathVariable String SmobileNumber, @PathVariable String RecmobileNumber,
			@PathVariable Float transferableAmount)  {
		service.fundTransfer(SmobileNumber, transferableAmount);
	}
}
