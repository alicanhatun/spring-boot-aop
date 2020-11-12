package com.alican.aop.controller;

import com.alican.aop.service.DeliveryService;
import com.alican.aop.service.NotifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/delivery")
public class DeliveryController {

    @Autowired
    private DeliveryService deliveryService;

    @Autowired
    private NotifyService notifyService;

    @GetMapping
    public String aspectSample() throws Exception {
        deliveryService.aspectSample("Delivery message");
        notifyService.aspectSample();
        notifyService.throwException();
        return "Api response";
    }
}
