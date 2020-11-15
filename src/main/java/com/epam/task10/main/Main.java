package com.epam.task10.main;

import com.epam.task10.entity.Segment;
import com.epam.task10.report.SegmentReport;
import com.epam.task10.service.SegmentService;

public class Main {
    public static void main(String[] args){
        Segment segment = new Segment(2.0, 4.0, 0.3);
        SegmentService segmentService = new SegmentService();
        double[] argValues = segmentService.argumentValues(segment);
        double[] funcValues = segmentService.functionValues(argValues);
        SegmentReport segmentReport = new SegmentReport();
        segmentReport.printTable(argValues, funcValues);
    }
}
