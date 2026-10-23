# Assignment SDP-5 — Strategy Pattern

## Introduction

This project is a short Java implementation of the **Strategy** design pattern. `Calculator` acts as the
*context*: it stores two numbers and delegates the calculation to a swappable `OperationStrategy`. The concrete
strategies — `AddStrategy`, `SubtractStrategy` and `MultiplyStrategy` — each encapsulate exactly one arithmetic
algorithm, so an operation can be replaced at runtime and a new one can be added without modifying the
existing classes.

## Project structure

```
src/
├── Main.java                              # Client — selects the concrete strategy
└── com/
    ├── calculator/
    │   └── Calculator.java                # Context — holds the operands, delegates the calculation
    └── strategy/
        ├── OperationStrategy.java         # Strategy  — the shared contract
        ├── AddStrategy.java               # Concrete  — addition
        ├── SubtractStrategy.java          # Concrete  — subtraction
        └── MultiplyStrategy.java          # Concrete  — multiplication
```

## How to compile and run

From the project root:

```bash
javac -d out src/Main.java src/com/calculator/Calculator.java src/com/strategy/*.java
java -cp out Main
```

Expected output:

```
Numbers: 5, 4.
Addition: 9.
Subtraction: 1.
Multiplication: 20.
```
