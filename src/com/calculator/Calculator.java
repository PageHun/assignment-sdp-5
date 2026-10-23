package com.calculator;

import com.strategy.OperationStrategy;

public class Calculator {
    private final int num1;
    private final int num2;
    private OperationStrategy operationStrategy;
    public Calculator(int num1, int num2, OperationStrategy operationStrategy) {
        this.num1 = num1;
        this.num2 = num2;
        this.operationStrategy =  operationStrategy;
    }
    public int getNum1() { return num1; }
    public int getNum2() { return num2; }
    public int getResult() { return operationStrategy.doOperation(getNum1(), getNum2()); }
    public void setOperationStrategy(OperationStrategy operationStrategy) {
        this.operationStrategy = operationStrategy;
    }
}
