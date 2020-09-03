package com.huangda7.designpattern.proxy.springbootaop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {
    //    @Pointcut("execution(* com.huangda7.designpattern.proxy.springbootaop.controller.TestController.*(..))")
//    public void beforeLogPointcut() {}
//    @Before("beforeLogPointcut()")
    @Before("execution(* com.huangda7.designpattern.proxy.springbootaop.controller.TestController.*(..))")
    public void beforeLog() {
        System.out.println("Log before exec method!");
    }

    @After("execution(* com.huangda7.designpattern.proxy.springbootaop.controller.TestController.*(..))")
    public void afterLog() {
        System.out.println("Log after exec method!");
    }

//    @Around("execution(* com.huangda7.designpattern.proxy.springbootaop.controller.TestController.*(..))")
//    public void aroundLog(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
//        System.out.println("Log around before exec method!");
//        proceedingJoinPoint.proceed();
//        System.out.println("Log around after exec method!");
//    }

}
