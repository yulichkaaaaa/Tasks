package com.epam.task10.entity;

public class Segment {

    private double start;
    private double end;
    private double step;

    public Segment(double start, double end, double step){
        this.start = start;
        this.end = end;
        this.step = step;
    }

    public double getStart() {
        return start;
    }

    public double getEnd() {
        return end;
    }

    public double getStep() {
        return step;
    }

    public void setStart(double start) {
        this.start = start;
    }

    public void setEnd(double end) {
        this.end = end;
    }

    public void setStep(double step) {
        this.step = step;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Interval{");
        sb.append("start=").append(start);
        sb.append(", end=").append(end);
        sb.append(", step=").append(step);
        sb.append('}');
        return sb.toString();
    }
}
