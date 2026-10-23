package com.strategy;

public class SubstractStrategy implements OperationStrategy {

    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
