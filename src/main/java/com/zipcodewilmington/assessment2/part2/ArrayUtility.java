package com.zipcodewilmington.assessment2.part2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {
        List<Integer> holder = new ArrayList<>();

        Collections.addAll(holder, array1);
        Collections.addAll(holder, array2);

        Integer[] results = holder.toArray(new Integer[0]);

        return results;
    }

    public Integer[] rotate(Integer[] array, Integer index) {
        return  null;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {
        int count = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == valueToEvaluate) {
                count++;
            }
        }
        for (int i = 0; i < array2.length; i++) {
            if (array2[i] == valueToEvaluate) {
                count++;
            }
        }


        return count;
    }

    public Integer mostCommon(Integer[] array) {
        return null;
    }
}
