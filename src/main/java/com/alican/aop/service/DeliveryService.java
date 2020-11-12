package com.alican.aop.service;

import org.springframework.stereotype.Service;

@Service
public class DeliveryService {

    public void aspectSample(String message) {
        System.out.println("Delivery Service aspectSample method");
    }

}
