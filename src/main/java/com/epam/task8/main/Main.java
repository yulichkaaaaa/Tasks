package com.epam.task8.main;

import com.epam.task8.entity.Function;
import com.epam.task8.report.FunctionReport;
import com.epam.task8.service.FunctionService;

public class Main {
    public static void main(String[] args){
        Function function = new Function(10);
        FunctionService functionService = new FunctionService();
        int value = functionService.findSolution(function);
        FunctionReport functionReport = new FunctionReport();
        functionReport.functionValue(value);
    }
}
