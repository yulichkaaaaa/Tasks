package com.epam.task6.service;

import com.epam.task6.entity.Day;

public class DayService {
   private final static int SECONDS_IN_HOUR = 3600;
   private final static int SECONDS_IN_MINUTE = 60;

    public Day secondsToDay(int seconds){
        int hours = secondsToHours(seconds);
        seconds -= SECONDS_IN_HOUR * hours;
        int minutes = secondsToMinutes(seconds);
        seconds -= SECONDS_IN_MINUTE * minutes;
        return new Day(hours, minutes, seconds);
    }

    private int secondsToHours(int seconds){
        return seconds / SECONDS_IN_HOUR;
    }

    private int secondsToMinutes(int seconds) {
        return seconds / SECONDS_IN_MINUTE;
     }
}
