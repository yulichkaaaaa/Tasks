package com.epam.task9.report;

import com.epam.task9.entity.Circle;

public class CircleReport {
    public void circleLength(Circle circle, double length) {
        String circleLength = String.format("Длина окружности заданного" +
                " радиуса %d равна %.2f.", circle.getRadius(), length);
        System.out.println(circleLength);
    }
    public void circleArea(Circle circle, double area){
        String circleArea = String.format("Площадь круга заданного" +
                " радиуса %d равна %.2f.", circle.getRadius(), area);
        System.out.println(circleArea);
    }
}
