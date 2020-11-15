package com.epam.task5.main;

import com.epam.task5.entity.CustomNumber;
import com.epam.task5.report.NumberReport;
import com.epam.task5.service.CustomNumberService;

public class Main {
    public static void main(String[] args){
        CustomNumber number1 = new CustomNumber(496);
        CustomNumber number2 = new CustomNumber(497);

        CustomNumberService numberService = new CustomNumberService();
        boolean isPerfect1 = numberService.isPerfect(number1);
        boolean isPerfect2 = numberService.isPerfect(number2);
        NumberReport numberReport = new NumberReport();
        numberReport.perfectNumber(isPerfect1);
        numberReport.perfectNumber(isPerfect2);
    }
}
