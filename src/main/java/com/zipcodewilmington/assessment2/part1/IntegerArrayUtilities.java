package com.zipcodewilmington.assessment2.part1;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {
        return array.length % 2 == 0 ? true : false;
    }

    public Integer[] range(int start, int stop) {
        int length = stop - start;
        Integer[] newArry = new Integer[length+1];
        for ( int i = start, j = 0; i <= stop; i++){
            newArry[j] = i;
            j++;
        }
//        for(int i = 0; i < newArry.length; i++){
//            System.out.println(newArry[i]);
//        }
        return newArry;
    }

    public Integer getSumOfFirstTwo(Integer[] array) {
        return array[0] + array[1];
    }

    public Integer getProductOfFirstTwo(Integer[] array) {
        return array[array.length -1] * array[array.length - 2];
    }
}
