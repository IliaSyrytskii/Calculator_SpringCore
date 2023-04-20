package org.example;

import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import java.util.Scanner;
@EnableAspectJAutoProxy
@Component
public class ConsoleReader {
    private final Scanner sc;

    public ConsoleReader(Scanner sc) {
        this.sc = sc;
    }

    public String readString() {
       return sc.next();
    }

    public double readDouble() {
        return sc.nextDouble();
    }
}
