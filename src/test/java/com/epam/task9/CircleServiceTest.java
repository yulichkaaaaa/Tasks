package com.epam.task9;

import com.epam.task9.entity.Circle;
import com.epam.task9.service.CircleService;
import org.testng.annotations.Test;
import static java.lang.Math.PI;

import static org.testng.Assert.assertEquals;

public class CircleServiceTest {
    private CircleService service = new CircleService();
    private Circle circle = new Circle(5);

    @Test
    public void countLengthTest() {
        double actual = service.countLength(circle);
        double expected = 10.0 * PI;
        assertEquals(actual, expected);
    }

    @Test
    public void countAreaTest() {
        double actual = service.countArea(circle);
        double expected = 25.0 * PI;
        assertEquals(actual, expected);
    }
}
