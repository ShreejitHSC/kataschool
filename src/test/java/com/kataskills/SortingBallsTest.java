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
    public void checkYouHaveAEmptyListAtStart(){
        List<Integer> sortedBallTestList = new ArrayList<>();
        assert(sortedBallTestList.equals(new SortingBalls().sortedBallList));
    }
}
