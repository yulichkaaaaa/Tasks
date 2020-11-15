package com.epam.task9.service;

import com.epam.task9.entity.Circle;
import static java.lang.Math.PI;

public class CircleService {

    public double countLength(Circle circle){
        double radius = circle.getRadius();
        return PI * 2 * radius;
    }

    public double countArea(Circle circle){
        double radius = circle.getRadius();
        return PI * radius * radius;
    }
}
