package org.example;

import org.springframework.stereotype.Component;


@Component
public class ConsoleApplication implements Application{
    private final ConsoleReader reader;
    private final ConsoleWriter writer;
    private final OperationService operationService;

    public ConsoleApplication(ConsoleReader reader, ConsoleWriter writer, OperationService operationService) {
        this.reader = reader;
        this.writer = writer;
        this.operationService = operationService;
    }

    @Override
    public void run() {
        double num1 = reader.readDouble();
        double num2 = reader.readDouble();

        writer.write("""
                                    CONSOLE CALCULATOR
                                     Choose operation
                           sum\t\t\tsub\t\t\tdiv\t\t\tmult\s
        Your choice:\s""");

        String type = reader.readString();
        switch (type){
            case "sum" :
                SumOperation sumOperation = new SumOperation(num1, num2);
                Operation calcSum = operationService.calculate(sumOperation);
                System.out.println(calcSum.getResult());
                break;
            case "sub" :
                SubOperation subOperation = new SubOperation(num1, num2);
                Operation calcSub = operationService.calculate(subOperation);
                System.out.println(calcSub.getResult());
                break;
            case "div" :
                DivOperation divOperation = new DivOperation(num1, num2);
                Operation calcDiv = operationService.calculate(divOperation);
                System.out.println(calcDiv.getResult());
                break;
            case "mult" :
                MultOperation multOperation = new MultOperation(num1, num2);
                Operation calcMult = operationService.calculate(multOperation);
                System.out.println(calcMult.getResult());
                break;
        }

    }
}
