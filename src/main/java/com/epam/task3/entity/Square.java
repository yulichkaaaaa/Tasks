package com.epam.task3.entity;

public class Square {
    private double side;

    public Square(double side) {
        this.side = side;
    }


    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Square{");
        sb.append("side=").append(side);
        sb.append('}');
        return sb.toString();
    }
}
