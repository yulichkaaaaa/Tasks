package com.epam.task8.report;

public class FunctionReport {
    public void functionValue(int value){
        String result = String.format("Значение функции равно %d.", value);
        System.out.println(result);
    }
}
