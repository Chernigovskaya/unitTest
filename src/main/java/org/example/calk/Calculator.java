package org.example.calk;



public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return a / b;
    }
    public int calculateDiscount(int sumCart, int discount) {
        if (sumCart <= 0 || discount <= 0)
            throw new IllegalStateException("Данные должны быть больше 0");
        return sumCart - (sumCart * discount / 100);
    }
}
