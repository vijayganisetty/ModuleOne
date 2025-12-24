package com.practice.spring.vijay.ModuleOne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ModuleOneApplication implements CommandLineRunner {

	@Autowired
	PaymentService paymentService;

	@Autowired
	PaymentService getPaymentService;

	public static void main(String[] args) {
		SpringApplication.run(ModuleOneApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println(paymentService.hashCode());
		System.out.println(getPaymentService.hashCode());

		paymentService.pay();
		getPaymentService.pay();
	}

}
