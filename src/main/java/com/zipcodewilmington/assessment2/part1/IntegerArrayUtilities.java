package com.zipcodewilmington.assessment2.part1;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {
        return array.length % 2 == 0 ? true : false;
    }

    public Integer[] range(int start, int stop) {
        int length = 0;
        Integer[] newArry = new Integer[11];
        for ( int i = start; i <= stop; i++){
            newArry[i] = i;
        }
        return newArry;
    }

    public Integer getSumOfFirstTwo(Integer[] array) {
        return array[0] + array[1];
    }

    public Integer getProductOfFirstTwo(Integer[] array) {
        return array[array.length -1] * array[array.length - 2];
    }
}
