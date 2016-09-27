package com.kataskills;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by JC87 on 9/27/2016.
 */
public class SortingBallsTest {

    @Test
    public void verifyYouHaveAEmptyListAtStart(){
        List<Integer> sortedBallTestList = new ArrayList<>();
        assertEquals(sortedBallTestList,new SortingBalls().sortedBallList);
    }

    @Test
    public void verifyTheDrawnBallIsAddedToTheList(){
        List<Integer> sortedBallTestList = new ArrayList<>();
        sortedBallTestList.add(0);
        assertEquals(sortedBallTestList.get(0),new SortingBalls().sortedBallList.get(0));
    }
}
