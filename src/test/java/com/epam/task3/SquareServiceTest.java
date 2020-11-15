package com.epam.task3;

import com.epam.task3.entity.Circle;
import com.epam.task3.entity.Square;
import com.epam.task3.service.SquareService;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SquareServiceTest {

    @Test
    public void calculateAreaTest() {
        SquareService service = new SquareService();
        Square square = new Square(4.0);
        double actual = service.calculateArea(square);
        double expected = 16.0;
        assertEquals(actual, expected);
    }

    @Test
    public void calculateAreasRelationTest() {
        SquareService service = new SquareService();
        double area1 = 4.0;
        double area2 = 2.0;
        double actual = service.calculateAreasRelation(area1, area2);
        double expected = 2.0;
        assertEquals(actual, expected);
    }


}
