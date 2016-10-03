package com.kataskills;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.*;
/**
 * Created by skakk2 on 10/3/2016.
 */
public class KarateChopTest {

    @Test
    public void validateTheArrayPassedIsSorted(){
        List unsortedArrayList = new ArrayList<Integer>(asList(1,3,5,7,2,4,6,8));
        List expectedSortedIntArray = new ArrayList<Integer>(asList(1,2,3,4,5,6,7,8));
        assertEquals(expectedSortedIntArray,new KarateChop().sortArray(unsortedArrayList));

    }
}
