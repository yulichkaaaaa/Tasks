package com.epam.task6;

import com.epam.task6.entity.Day;
import com.epam.task6.service.DayService;
import org.testng.annotations.Test;

import static org.testng.Assert.assertSame;

public class DayServiceTest {
    @Test
    public void secondsToDayTest() {
        DayService service = new DayService();
        Day actual = service.secondsToDay(11211);
        Day expected = new Day(3, 6, 51);
        assertSame(actual, expected);
    }
}
