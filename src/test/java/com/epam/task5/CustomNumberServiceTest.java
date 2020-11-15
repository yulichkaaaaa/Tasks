package com.epam.task5;

import com.epam.task4.entity.NumberSequence;
import com.epam.task4.service.SequenceService;
import com.epam.task5.entity.CustomNumber;
import com.epam.task5.service.CustomNumberService;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class CustomNumberServiceTest {
    @Test
    public void sequenceHasTwoEvenTest() {
        CustomNumberService service = new CustomNumberService();
        CustomNumber number = new CustomNumber(6);
        boolean actual = service.isPerfect(number);
        assertTrue(actual);
    }
}
