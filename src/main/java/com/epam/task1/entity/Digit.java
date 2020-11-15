package com.epam.task1.entity;

public class Digit {

    private int value;

    public Digit(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Digit{");
        sb.append("value=").append(value);
        sb.append('}');
        return sb.toString();
    }

}
