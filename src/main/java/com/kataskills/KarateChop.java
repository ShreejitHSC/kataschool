package com.kataskills;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Arrays.asList;

/**
 * Created by skakk2 on 10/3/2016.
 */
public class KarateChop {


    public List sortArray(List unsortedIntArray) {
        Collections.sort(unsortedIntArray);
        return unsortedIntArray;
    }

    public int parameterPassed(String paramterToBePassed) {
        return Integer.parseInt(paramterToBePassed);
    }

    public int positionOfValue(List arrayToBeSearched, int valueToBeSearched) {
        List sortedArrayList = sortArray(arrayToBeSearched);
        int startValue = 0;
        int endValue = sortedArrayList.size() - 1;
        int returnPos = -1;
        while(startValue <= endValue){
            int middleValue = (startValue + endValue)/2;
            if((Integer) sortedArrayList.get(middleValue) == (valueToBeSearched))
                return middleValue;
            if((Integer) sortedArrayList.get(middleValue) < valueToBeSearched){
                startValue = middleValue  + 1;
            }

        }
        return returnPos;
    }
}
