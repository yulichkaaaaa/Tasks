package com.epam.task4.service;

import com.epam.task4.entity.NumberSequence;

public class SequenceService {

    public boolean isEven(int num){
        return (num % 2) == 0;
    }

    public boolean sequenceHasTwoEven(NumberSequence numSequence){
        int[] sequence = numSequence.getSequence();
        int i = 0;
        int evenCount = 0;
        while((i < sequence.length) && (evenCount < 2)){
            if(isEven(sequence[i])){
                evenCount++;
            }
            i++;
        }
        return evenCount > 1;
    }

}
