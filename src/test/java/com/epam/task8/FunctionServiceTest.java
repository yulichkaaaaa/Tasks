package com.epam.task8;

import com.epam.task8.entity.Function;
import com.epam.task8.service.FunctionService;
import org.testng.annotations.Test;

import static org.testng.Assert.assertSame;

public class FunctionServiceTest {
    @Test
    public void findSolutionTest() {
        FunctionService service = new FunctionService();
        Function function = new Function(10);
        int actual = service.findSolution(function);
        int expected = -61;
        assertSame(actual, expected);
    }
}
