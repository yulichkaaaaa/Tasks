package com.epam.task8.service;

import com.epam.task8.entity.Function;

public class FunctionService {

    public int findSolution(Function function){
        int x = function.getX();
        if (x < 3){
            return solveXLessThree(x);
        }else{
            return solveXMoreThree(x);
        }
    }   

    private int solveXLessThree(int x){
        return 1 / (x * x * x - 6);
    }

    private int solveXMoreThree(int x){
        return (-1 * x * x) + (3 * x) + 9;
    }

}
