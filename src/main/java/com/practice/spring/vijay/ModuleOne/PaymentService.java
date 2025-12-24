package com.practice.spring.vijay.ModuleOne;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class PaymentService {

    void pay(){
        System.out.println("paying");
    }

    @PostConstruct
    public void afterInit(){
        System.out.println("bean is constructed");
    }

    @PreDestroy
    public void beforeDestroy(){
        System.out.println("bean is about to destroy");
    }

}
