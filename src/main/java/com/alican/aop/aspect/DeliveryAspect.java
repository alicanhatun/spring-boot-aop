package com.alican.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DeliveryAspect {

    @Before("execution(* com.alican.aop.service.DeliveryService.*(..))")
    public void beforeMethod(JoinPoint joinPoint) {
        System.out.println("DeliveryAspect beforeMethod: " + joinPoint.getArgs()[0]);
    }

    @After("execution(* com.alican.aop.service.DeliveryService.*(..))")
    public void afterMethod(JoinPoint joinPoint) {
        System.out.println("DeliveryAspect afterMethod: " + joinPoint.getArgs()[0]);
    }
}
