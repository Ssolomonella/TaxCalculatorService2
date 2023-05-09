package com.techdojo.taxcalculator.components;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
public class TaxCalculatorComponentImpTest {
@Autowired
    TaxCalculator taxCalculator;

    /*
     *  Tax brackets
     * Tax bracket A(0 to 14k) = 10.5%
     * Tax bracket B($14,001 to $48,000) = 17.50%
     * Tax bracket C($48,001 to $70,000) = 30.00%
     * Tax bracket D($70,001 to $180,000) = 33.00%
     * Tax bracket E($180,000+) = 39.00%
     * */

    @Test
    void taxBracketAisAppliedWhenIncomeIsBellow14k() {
        double income = 14000.00;
        double actualTaxToPay = taxCalculator.calculateTax(income);
        double expectedTaxToPay = income * (10.5 / 100);
        Assertions.assertEquals(expectedTaxToPay,actualTaxToPay,"Amount is not as expected ");
    }
    @Test
    void taxBracketBisAppliedWhenIncomeIsBellow14k() {
        double income = 14001.00;
        double actualTaxToPay = taxCalculator.calculateTax(income);
        double expectedTaxToPay = income * (17.5 / 100);
        Assertions.assertEquals(expectedTaxToPay,actualTaxToPay,"Amount is not as expected ");

    }
    @Test
    void taxBracketCisAppliedWhenIncomeIsBellow14k() {
        double income = 48001.00;
        double actualTaxToPay = taxCalculator.calculateTax(income);
        double expectedTaxToPay = income * (30.0 / 100);
        Assertions.assertEquals(expectedTaxToPay,actualTaxToPay,"Amount is not as expected ");
    }
    @Test
    void taxBracketDisAppliedWhenIncomeIsBellow14k() {
        double income = 70001.00;
        double actualTaxToPay = taxCalculator.calculateTax(income);
        double expectedTaxToPay = income * (33.0 / 100);
        Assertions.assertEquals(expectedTaxToPay,actualTaxToPay,"Amount is not as expected ");
    }
    @Test
    void taxBracketEisAppliedWhenIncomeIsBellow14k() {
        double income = 180001.00;
        double actualTaxToPay = taxCalculator.calculateTax(income);
        double expectedTaxToPay = income * (39.0 / 100);
        Assertions.assertEquals(expectedTaxToPay,actualTaxToPay,"Amount is not as expected ");
    }
    @Test
    void taxBracketEisAppliedWhenIncomeIsBellow0() {
        double income = 0.00;
        double actualTaxToPay = taxCalculator.calculateTax(income);
        double expectedTaxToPay = income * (39.0 / 100);
        Assertions.assertEquals(expectedTaxToPay,actualTaxToPay,"Amount is not as expected ");
    }
}
