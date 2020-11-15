package com.epam.task3;

import com.epam.task3.entity.Circle;
import com.epam.task3.service.CircleService;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CircleServiceTest {

    @Test
    public void calculateRadiusInscribedTest() {
        CircleService service = new CircleService();
        double actual = service.calculateRadiusInscribed(10.0);
        double expected = 5.0;
        assertEquals(actual, expected);
    }
}
