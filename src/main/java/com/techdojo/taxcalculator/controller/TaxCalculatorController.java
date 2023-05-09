package com.techdojo.taxcalculator.controller;

import com.techdojo.taxcalculator.components.TaxCalculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TaxCalculatorController {
    @Autowired
    TaxCalculator taxCalculator;

    @GetMapping("/api/calculatetax")
    @ResponseBody
    public String calculatetax(@RequestParam double income){
        return "Your tax is"+taxCalculator.calculateTax(income);
    }
}
