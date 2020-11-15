package com.epam.task10;

import com.epam.task10.entity.Segment;
import com.epam.task10.service.SegmentService;
import com.epam.task9.entity.Circle;
import com.epam.task9.service.CircleService;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SegmentServiceTest {

    @Test
    public void argumentValuesTest() {
        SegmentService service = new SegmentService();
        Segment segment = new Segment(2.0, 4.0, 0.3);
        double[] actual = service.argumentValues(segment);
        double[] expected = {2.0, 2.3, 2.6, 2.9, 3.2, 3.5, 3.8};
        assertEquals(actual, expected);
    }

}
