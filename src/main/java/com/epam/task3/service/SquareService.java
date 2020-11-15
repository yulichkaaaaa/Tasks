package com.epam.task3.service;

import com.epam.task3.entity.Circle;
import com.epam.task3.entity.Square;

import static java.lang.Math.sqrt;

public class SquareService {
    private final static double SIN45 = sqrt(2) / 2;

    public double calculateSide(double area){
        return sqrt(area);
    }

    public double calculateArea(Square square){
        double side = square.getSide();
        return side * side;
    }

    public double calculateSideInscribed(Circle circle){
        double radius = circle.getRadius();
        return radius / SIN45;
    }

    public double calculateAreasRelation(double areaCircumscribed,
                                         double areaInscribed){
        return areaCircumscribed / areaInscribed;
    }


}
