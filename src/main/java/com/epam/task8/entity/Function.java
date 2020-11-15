package com.epam.task8.entity;

public class Function{
    private int x;

    public Function(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Function{");
        sb.append("x=").append(x);
        sb.append('}');
        return sb.toString();
    }
}
