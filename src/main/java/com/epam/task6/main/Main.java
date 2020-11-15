package com.epam.task6.main;

import com.epam.task6.entity.Day;
import com.epam.task6.report.DayReport;
import com.epam.task6.service.DayService;

public class Main {
    public static void main(String[] args){
        DayService dayService = new DayService();
        Day day = dayService.secondsToDay(11211);
        DayReport dayReport = new DayReport();
        dayReport.currentTime(day);
    }
}
