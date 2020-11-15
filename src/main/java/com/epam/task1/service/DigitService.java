package com.epam.task1.service;

import com.epam.task1.entity.Digit;

public class DigitService {

    public Digit calculateSquare(Digit digit){
        int squareDigit = (digit.getValue() * digit.getValue()) % 10;
        return new Digit(squareDigit);
    }

}
