package com.cg.spring.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.spring.dto.Customer;

@Repository("customerRepository")
public interface IPaymentWalletDAO extends CrudRepository<Customer, String> {

}
