package org.example;

import org.springframework.stereotype.Component;

@Component
public class ConsoleWriter {
    void write(String message) {
        System.out.println(message);
    }
    void write(double res) {
        System.out.println(res);
    }
}
