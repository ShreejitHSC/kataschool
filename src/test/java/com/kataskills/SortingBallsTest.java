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
        assertEquals(sortedBallTestList.get(0),new SortingBalls().sortedList(0).get(0));
    }

    @Test
    public void verifyThatSortedListContainsMultipleValue(){
        List<Integer> sortedBallTestList = new ArrayList<>();
        SortingBalls sortingBalls = new SortingBalls();

        sortedBallTestList.add(0);
        assertEquals(sortedBallTestList,sortingBalls.sortedList(0));

        sortedBallTestList.add(1);
        assertEquals(sortedBallTestList,sortingBalls.sortedList(1));
    }

    @Test
    public void verifyThatBallsAreSorted(){
        List<Integer> sortedBallTestList = new ArrayList<>();
        SortingBalls sortingBalls = new SortingBalls();

        sortedBallTestList.add(0);
        sortedBallTestList.add(1);

        sortingBalls.sortedList(1);
        sortingBalls.sortedList(0);

        assertEquals(sortedBallTestList,sortingBalls.sortedBallList);
    }

    @Test
    public void verifyThatMoreBallsAreSorted(){
        List<Integer> sortedBallTestList = new ArrayList<>();
        SortingBalls sortingBalls = new SortingBalls();

        sortedBallTestList.add(0);
        sortedBallTestList.add(1);
        sortedBallTestList.add(2);

        sortingBalls.sortedList(1);
        sortingBalls.sortedList(2);
        sortingBalls.sortedList(0);

        assertEquals(sortedBallTestList,sortingBalls.sortedBallList);
    }
}
