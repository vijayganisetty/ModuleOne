package com.practice.spring.vijay.ModuleOne.impl;

import com.practice.spring.vijay.ModuleOne.NotificationService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("mail")
//@Primary
//@ConditionalOnProperty(name = "Notification.type", havingValue = "mail")
public class mailNotificationService implements NotificationService {
    @Override
    public void send(String message) {
        System.out.println("mail sending....."+message);
    }
}
