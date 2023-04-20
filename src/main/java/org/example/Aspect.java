package org.example;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@org.aspectj.lang.annotation.Aspect
@Component
public class Aspect {

    @Pointcut("execution(public * ConsoleReader.readDouble())")
    public void pointCut(){}

    @Before("pointCut()")
    public void aspect() {
        System.out.println("Enter number");
    }

}
