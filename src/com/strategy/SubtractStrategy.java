package com.strategy;

public class SubtractStrategy implements OperationStrategy {

    @Override
    public int doOperation(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }
}
