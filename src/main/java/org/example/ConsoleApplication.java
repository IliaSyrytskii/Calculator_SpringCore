package org.example;

import org.springframework.stereotype.Component;

import java.util.logging.Level;
import java.util.logging.Logger;

@Component
public class ConsoleApplication implements Application{
    private final ConsoleReader reader;
    private final ConsoleWriter writer;
    private final OperationService operationService;
    private final Logger logger = Logger.getLogger("");

    public ConsoleApplication(ConsoleReader reader, ConsoleWriter writer, OperationService operationService) {
        this.reader = reader;
        this.writer = writer;
        this.operationService = operationService;
    }

    @Override
    public void run() {
        logger.log(Level.INFO, "Info");
        writer.write("enter num1");
        double num1 = reader.readDouble();
        logger.log(Level.SEVERE, "Severe");
        writer.write("enter num2");
        double num2 = reader.readDouble();
        logger.log(Level.WARNING, "Warning");
        SumOperation sumOperation = new SumOperation(num1, num2);
        Operation calc = operationService.calculate(sumOperation);
        System.out.println(calc.getResult());
    }
}
