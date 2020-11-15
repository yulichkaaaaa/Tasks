package com.epam.task2.service;

import com.epam.task2.entity.CustomDate;

public class CustomDateService {

    public final static int DAYS_IN_LONG_MONTH = 31;
    public final static int DAYS_IN_SHORT_MONTH = 30;
    public final static int DAYS_IN_FEBRUARY_NOT_LEAP = 28;
    public final static int DAYS_IN_FEBRUARY_LEAP = 29;


    public boolean yearIsLeap(CustomDate date){
        int year = date.getYear();
        boolean isLeap = false;
        if (year % 100 == 0){
             isLeap = (year % 400) == 0;
        }else{
            isLeap = (year % 4) == 0;
        }
        return isLeap;
    }

    public int daysInMonth(CustomDate date){
        int month = date.getMonth();
        boolean isLeap = yearIsLeap(date);

        if(month == 2){
            if(isLeap){
                return DAYS_IN_FEBRUARY_LEAP;
            }else{
                return DAYS_IN_FEBRUARY_NOT_LEAP;
            }
        }
        return switch (month) {
            case 4, 6, 9, 11 -> DAYS_IN_SHORT_MONTH;
            default -> DAYS_IN_LONG_MONTH;
        };
    }
}
