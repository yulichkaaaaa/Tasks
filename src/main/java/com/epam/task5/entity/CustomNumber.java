package com.epam.task5.entity;

public class CustomNumber {
    private int value;

    public CustomNumber(int value) {
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
        final StringBuilder sb = new StringBuilder("CustomNumber{");
        sb.append("value=").append(value);
        sb.append('}');
        return sb.toString();
    }
}
