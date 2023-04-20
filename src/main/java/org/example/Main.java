package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(CoreConfiguration.class);
        ConsoleApplication consoleApplication = context.getBean("consoleApplication", ConsoleApplication.class);
        consoleApplication.run();
    }
}