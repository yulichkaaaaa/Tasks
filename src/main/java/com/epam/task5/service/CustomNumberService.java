package com.epam.task5.service;

import com.epam.task5.entity.CustomNumber;

public class CustomNumberService {
    public boolean isPerfect(CustomNumber customNumber){
        int num = customNumber.getValue();
        int dividersSum = dividersSum(num);
        return num == dividersSum;
    }

    private int dividersSum(int number){
        int sum = 0;
        for(int i = 1; i < number; i++){
            if((number % i) == 0){
                sum += i;
            }
        }
        return sum;
    }
}
