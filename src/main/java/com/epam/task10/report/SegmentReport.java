package com.epam.task10.report;

public class SegmentReport {

    public void printTable(double[] argValues, double[] funcValues){
        System.out.println(printDoubleArr(argValues));
        System.out.println(printLine(argValues.length));
        System.out.println(printDoubleArr(funcValues));
    }

    private String printDoubleArr(double[] arr){
        String printArr = "";
        String arrElement;
        for (int i = 0; i < arr.length; i++){
            arrElement = String.format("| %3.3f |", arr[i]);
            printArr += arrElement;
        }
        return printArr;
    }

    private String printLine(int arrSize){
        String line = "";
        for(int i = 0; i < arrSize; i++){
            line += "___________";
        }
        return line;
    }
}
