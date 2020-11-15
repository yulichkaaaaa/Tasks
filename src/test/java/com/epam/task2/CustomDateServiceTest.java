package com.epam.task2;

import com.epam.task2.entity.CustomDate;
import com.epam.task2.service.CustomDateService;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CustomDateServiceTest {

    @Test
    public void daysInMonthTest() {
        CustomDate date = new CustomDate(2020, 2);
        CustomDateService service = new CustomDateService();
        int actual = service.daysInMonth(date);
        int expected = 29;
        assertEquals(actual, expected);
    }

}
