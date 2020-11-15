package com.epam.task10.service;

import com.epam.task10.entity.Segment;

import static java.lang.Math.*;

public class SolutionService {

    public double[] argumentValues(Segment segment) {
        double start = segment.getStart();
        double end = segment.getEnd();
        double step = segment.getStep();
        double segmentLen = end - start;
        int size = (int)floor(segmentLen / step) + 1;
        double[] argValues = new double[size];

        for(int i = 0; i < size; i++){
            argValues[i] = start + step * i;
        }
        return argValues;
    }

    public double[] functionValues(double[] argValues){
        double[] funcValues = new double[argValues.length];

        for(int i = 0; i < funcValues.length; i++){
            funcValues[i] = tan(argValues[i]);
        }
        return funcValues;
    }

}
