package com.epam.task2.report;

import com.epam.task2.entity.CustomDate;

public class CustomDateReport {
    public void daysInMonth(CustomDate date, int days){
        String report = String.format("В месяце номер %d %d дней.",
                date.getMonth(), days);
        System.out.println(report);
    }
}
