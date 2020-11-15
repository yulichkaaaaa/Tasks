package com.epam.task10.main;

import com.epam.task10.entity.Segment;
import com.epam.task10.report.SegmentReport;
import com.epam.task10.service.SolutionService;

public class Main {
    public static void main(String[] args){
        Segment segment = new Segment(2.0, 4.0, 0.3);
        SolutionService solutionService = new SolutionService();
        double[] argValues = solutionService.argumentValues(segment);
        double[] funcValues = solutionService.functionValues(argValues);
        SegmentReport segmentReport = new SegmentReport();
        segmentReport.printTable(argValues, funcValues);
    }
}
