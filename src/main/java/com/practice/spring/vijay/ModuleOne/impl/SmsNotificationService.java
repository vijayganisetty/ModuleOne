package com.practice.spring.vijay.ModuleOne.impl;

import com.practice.spring.vijay.ModuleOne.NotificationService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("sms")
public class SmsNotificationService implements NotificationService {
    @Override
    public void send(String message) {
        System.out.println("sms sending......."+ message);
    }
}
