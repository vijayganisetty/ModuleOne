package com.practice.spring.vijay.ModuleOne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Map;

@SpringBootApplication
public class ModuleOneApplication implements CommandLineRunner {

	@Autowired
	PaymentService paymentService;  // field injection

    private final NotificationService notificationService;

    public ModuleOneApplication(@Qualifier("sms") NotificationService notificationService) {
        this.notificationService = notificationService;
		// construction injection
    }

	private NotificationService mailNotification;

	@Autowired
	public void setPaymentService(@Qualifier("mail") NotificationService mailNotification){
		this.mailNotification = mailNotification;  //setter injection
	}


	@Autowired
	Map<String,NotificationService> notificationServiceMap;

    public static void main(String[] args) {
		SpringApplication.run(ModuleOneApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println(paymentService.hashCode());
		paymentService.pay();

		notificationService.send("hello");

		mailNotification.send("hai....");

		for(var service: notificationServiceMap.entrySet()){

			System.out.println(service.getKey());
			service.getValue().send("Sending.....");


		}


	}

}
