package com.epam.task2.main;

import com.epam.task2.entity.CustomDate;
import com.epam.task2.report.CustomDateReport;
import com.epam.task2.service.CustomDateService;

public class Main {
    public static void main(String[] args){
        CustomDate customDate = new CustomDate(2100, 2);
        CustomDateService dateService = new CustomDateService();
        int days = dateService.daysInMonth(customDate);
        CustomDateReport dateReport = new CustomDateReport();
        dateReport.daysInMonth(customDate, days);
    }

}
