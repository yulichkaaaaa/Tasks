package com.epam.task1.report;

import com.epam.task1.entity.Digit;

public class DigitReport {
    public void lastDigitOfSquare(Digit digit, Digit square){
        System.out.println("Если последняя цифра числа " + digit.getValue() +
                ", то последняя цифра его квадрата " + square.getValue() + ".");
    }
}
