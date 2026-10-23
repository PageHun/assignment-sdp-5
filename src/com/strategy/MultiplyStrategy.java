package com.strategy;

public class MultiplyStrategy implements OperationStrategy {

    @Override
    public int doOperation(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }
}
