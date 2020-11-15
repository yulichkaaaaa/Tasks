package com.epam.task4.main;

import com.epam.task4.entity.NumberSequence;
import com.epam.task4.report.SequenceReport;
import com.epam.task4.service.SequenceService;

public class Main {
    public static void main(String[] args){
        int[] arr = {2, 3, 8, 9};
        NumberSequence sequence = new NumberSequence(arr);
        arr = sequence.getSequence();
        SequenceService sequenceService = new SequenceService();
        boolean result = sequenceService.sequenceHasTwoEven(arr);
        SequenceReport sequenceReport = new SequenceReport();
        sequenceReport.sequenceHasTwoEven(result);
    }
}
