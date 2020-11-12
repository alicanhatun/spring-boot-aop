package com.alican.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class NotifyAspect {

    @After("execution(* com.alican.aop.service.NotifyService.aspectSample(..))")
    public void afterMethod(JoinPoint joinPoint) {
        System.out.println("NotifyAspect afterMethod");
    }

    @AfterReturning("execution(* com.alican.aop.service.NotifyService.aspectSample(..))")
    public void afterReturningMethod(JoinPoint joinPoint) {
        System.out.println("NotifyAspect afterReturningMethod");
    }

    @AfterThrowing("execution(* com.alican.aop.service.NotifyService.*(..))")
    public void afterThrowingMethod(JoinPoint joinPoint) {
        System.out.println("NotifyAspect afterThrowingMethod");
    }
}
