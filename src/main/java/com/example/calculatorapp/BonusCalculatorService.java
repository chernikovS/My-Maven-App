package com.example.calculatorapp;

public class BonusCalculatorService {

    public double calculateBonus(double salesAmount) {
        if (salesAmount < 0) {
            throw new IllegalArgumentException("Sales amount cannot be negative.");
        }
        return salesAmount * 0.10;
    }
}