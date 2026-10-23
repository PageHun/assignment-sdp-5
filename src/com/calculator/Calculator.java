package com.calculator;

import com.strategy.OperationStrategy;

public class Calculator {
    private final int firstNumber;
    private final int secondNumber;
    private OperationStrategy operationStrategy;
    public Calculator(int firstNumber, int secondNumber, OperationStrategy operationStrategy) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.operationStrategy =  operationStrategy;
    }
    public int getFirstNumber() { return firstNumber; }
    public int getSecondNumber() { return secondNumber; }
    public int getResult() { return operationStrategy.doOperation(getFirstNumber(), getSecondNumber()); }
    public void setOperationStrategy(OperationStrategy operationStrategy) {
        this.operationStrategy = operationStrategy;
    }
}
