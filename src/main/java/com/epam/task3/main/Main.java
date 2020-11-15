package com.epam.task3.main;

import com.epam.task3.entity.Circle;
import com.epam.task3.entity.Square;
import com.epam.task3.report.FiguresReport;
import com.epam.task3.service.CircleService;
import com.epam.task3.service.SquareService;

public class Main {
    public static void main(String[] args){
        Square square1 = new Square(36.0);
        double side1 = square1.getSide();
        CircleService circleService = new CircleService();
        SquareService squareService = new SquareService();
        double radius = circleService.calculateRadiusInscribed(side1);
        Circle circle = new Circle(radius);
        double side2 = squareService.calculateSideInscribed(circle);
        Square square2 = new Square(side2);
        double area1 = squareService.calculateArea(square1);
        double area2 = squareService.calculateArea(square2);
        double relation = squareService.calculateAreasRelation(area1,area2);
        FiguresReport figuresReport = new FiguresReport();
        figuresReport.aresRelations(relation);
    }
}
