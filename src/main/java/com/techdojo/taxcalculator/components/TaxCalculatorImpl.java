package com.techdojo.taxcalculator.components;

import org.springframework.stereotype.Component;

@Component
public class TaxCalculatorImpl implements TaxCalculator {
    @Override
    public double calculateTax(double income) {
        if (income>180000 && income<=200000){
            return income * (39.0/100);
        }
        if (income>70000 && income<=180000){
            return income * (33.0/100);
        }
        if (income>48000 && income<=70000){
            return income * (30.0/100);
        }
        if (income>14000 && income<=48000){
            return income * (17.5/100);
        }
        return income * (10.5/100);
    }
}
