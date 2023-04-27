package org.example;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.logging.Level;
import java.util.logging.Logger;

@org.aspectj.lang.annotation.Aspect
@Component
public class Aspect {

    private final Logger logger = Logger.getLogger("");

    @Pointcut("execution(public * ConsoleReader.readDouble())")
    public void pointCut(){}

    @Before("pointCut()")
    public void aspect() {
        System.out.println("Enter number");
        logger.log(Level.INFO, "Aspect worked up.");
    }

}
