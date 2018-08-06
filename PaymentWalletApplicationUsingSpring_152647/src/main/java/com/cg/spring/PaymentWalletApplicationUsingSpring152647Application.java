package com.cg.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.cg.spring")
public class PaymentWalletApplicationUsingSpring152647Application {

	public static void main(String[] args) {
		SpringApplication.run(PaymentWalletApplicationUsingSpring152647Application.class, args);
	}
}
