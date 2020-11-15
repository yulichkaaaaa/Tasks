package com.epam.task4;

import com.epam.task3.entity.Square;
import com.epam.task3.service.CircleService;
import com.epam.task4.entity.NumberSequence;
import com.epam.task4.service.SequenceService;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SequenceServiceTest {
    @Test
    public void sequenceHasTwoEvenTest() {
        int[] arr = {2, 3, 8, 9};
        SequenceService service = new SequenceService();
        NumberSequence sequence = new NumberSequence(arr);
        boolean actual = service.sequenceHasTwoEven(sequence);
        assertTrue(actual);
    }
}
