package com.zipcodewilmington.assessment2.part1;

public class WuTangConcatenator {
    Integer input;
    public WuTangConcatenator(Integer input) {
        this.input = input;
    }

    public Boolean isWu() {
        return input % 3 == 0 ? true : false;
    }

    public Boolean isTang() {
        return input % 5 == 0 ? true : false;
    }

    public Boolean isWuTang() {
        return input % 15 == 0 ? true : false;
    }
}
