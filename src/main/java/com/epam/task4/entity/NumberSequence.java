package com.epam.task4.entity;

import java.util.Arrays;

public class NumberSequence {

    private int[] sequence;

    public NumberSequence(int[] sequence) {
        this.sequence = sequence;
    }

    public int[] getSequence() {
        return sequence;
    }

    public void setSequence(int[] sequence) {
        this.sequence = sequence;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("NumberSequence{");
        sb.append("sequence=").append(Arrays.toString(sequence));
        sb.append('}');
        return sb.toString();
    }
}
