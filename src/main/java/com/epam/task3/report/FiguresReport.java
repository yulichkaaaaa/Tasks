package com.epam.task3.report;

public class FiguresReport {

    public void aresRelations(double relation){
        String result = String.format("Площадь описанного около окружности больше " +
                "площади вписанного в неё в %.1f раз.", relation);
        System.out.println(result);
    }

}
