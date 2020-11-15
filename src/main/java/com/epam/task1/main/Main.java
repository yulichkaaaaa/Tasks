package com.epam.task1.main;

import com.epam.task1.entity.Digit;
import com.epam.task1.report.DigitReport;
import com.epam.task1.service.DigitService;

public class Main {
    public static void main(String[] args){
        Digit digit = new Digit(3);
        DigitService digitService = new DigitService();
        Digit result = digitService.calculateSquare(digit);
        DigitReport digitReport = new DigitReport();
        digitReport.lastDigitOfSquare(digit, result);
    }
}
