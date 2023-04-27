package org.example;

public class SubOperation implements Operation {
    private double num1;
    private double num2;
    private double res;

    public SubOperation(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public Operation process() {
        res = num1 - num2;
        return this;
    }

    @Override
    public double getResult() {
        return this.res;
    }
}
