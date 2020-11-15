package com.epam.task1;

import com.epam.task1.entity.Digit;
import com.epam.task1.service.DigitService;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class DigitServiceTest {
    @Test
    public void calculateSquareTest(){
        Digit digit = new Digit(3);
        DigitService digitService = new DigitService();
        Digit actual = digitService.calculateSquare(digit);
        Digit expected = new Digit(9);
        assertSame(actual, expected);
    }
}
