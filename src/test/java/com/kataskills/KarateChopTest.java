package com.kataskills;

import org.junit.Before;
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
    private KarateChop karateChop;

    @Before
    public void before(){
        karateChop = new KarateChop();
    }

    @Test
    public void validateTheArrayPassedIsSorted(){
        List unsortedArrayList = new ArrayList<>(asList(1, 3, 5, 7, 2, 4, 6, 8));
        List expectedSortedIntArray = new ArrayList<>(asList(1, 2, 3, 4, 5, 6, 7, 8));
        assertEquals(expectedSortedIntArray,karateChop.sortArray(unsortedArrayList));
    }

    @Test
    public void verifyAMidValueIsReturned(){
        List arrayToBeSearched = new ArrayList<>(asList(6,7,8));
        assertEquals(karateChop.positionOfValue(arrayToBeSearched,karateChop.parameterPassed("7")),1);
    }

    @Test
    public void returnThePositionOfTheValueWhichIsOnTheHigherIndexPostion(){
        List arrayToBeSearched = new ArrayList<>(asList(20,22,21,46,34,65,54));
        assertEquals(karateChop.positionOfValue(arrayToBeSearched,karateChop.parameterPassed("54")),5);
    }

    @Test
    public void returnThePositionOfTheValueWhichIsOnTheLowerIndexPostion(){
        List arrayToBeSearched = new ArrayList<>(asList(20,22,21,46,34,65,54));
        assertEquals(karateChop.positionOfValue(arrayToBeSearched,karateChop.parameterPassed("22")),2);
    }
}
