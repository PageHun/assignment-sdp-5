package com.strategy;

public class AddStrategy implements OperationStrategy {

    @Override
    public int doOperation(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
}
