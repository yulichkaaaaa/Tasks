package com.epam.task6.report;

import com.epam.task6.entity.Day;

public class DayReport {
    public void currentTime(Day day){
        String currentTime = String.format("К текущему моменту прошло " +
                "%d часов, %d минут, %d секунд.",
                day.getHours(), day.getMinutes(), day.getSeconds());

        System.out.println(currentTime);
    }
}
