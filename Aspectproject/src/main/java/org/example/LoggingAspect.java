package org.example;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class LoggingAspect {
    @Before("execution(* org.example.ShoppingCart.checkout(..))")
    public void logger(JoinPoint jp)
    {
        System.out.println(jp.getSignature());
        System.out.println(Arrays.toString(jp.getArgs()));
        System.out.println("Start loggers");
    }
    @Pointcut("execution(* *.*.*.quantify(..)")
    public void afterReturningPointCut(){}

    @AfterReturning(pointcut = "afterReturningPointCut",returning = "retVal")

    @After("execution(* *.*.*.checkout(..))")
    public void afterLogger(){
        System.out.println("After logger");
    }
}
