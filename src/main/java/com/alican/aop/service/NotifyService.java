package com.alican.aop.service;

import org.springframework.stereotype.Service;

@Service
public class NotifyService {

    public void aspectSample() {
        System.out.println("NotifyService aspectSample method");
    }

    public void throwException() throws Exception {
        throw new Exception("Kontrollü hata girişimi!");
    }
}
