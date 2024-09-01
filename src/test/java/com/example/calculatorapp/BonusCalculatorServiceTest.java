package com.example.calculatorapp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BonusCalculatorServiceTest {

    private final BonusCalculatorService service = new BonusCalculatorService();

    @Test
    public void testCalculateBonusValidAmount() {
        double salesAmount = 1000.0;
        double expectedBonus = 100.0;
        double actualBonus = service.calculateBonus(salesAmount);
        assertEquals(expectedBonus, actualBonus,
                "The calculated bonus should be 10% of the sales amount.");
    }

    @Test
    public void testCalculateBonusNegativeAmount() {
        double salesAmount = -500.0;
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            service.calculateBonus(salesAmount);
        });
        assertEquals("Sales amount cannot be negative.", exception.getMessage());
    }
}