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
}
