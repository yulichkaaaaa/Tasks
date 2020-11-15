package com.epam.task9.main;

import com.epam.task9.entity.Circle;
import com.epam.task9.report.CircleReport;
import com.epam.task9.service.CircleService;

public class Main {
    public static void main(String[] args){
        CircleService circleService = new CircleService();
        Circle circle = new Circle(5);
        double length = circleService.countLength(circle);
        double area = circleService.countSquare(circle);
        CircleReport circleReport = new CircleReport();
        circleReport.circleLength(circle, length);
        circleReport.circleArea(circle, area);
    }
}
