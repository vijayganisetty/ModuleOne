package com.practice.spring.vijay.ModuleOne.configs;

import com.practice.spring.vijay.ModuleOne.PaymentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    PaymentService getPaymentService(){
        return new PaymentService();
    }
}
