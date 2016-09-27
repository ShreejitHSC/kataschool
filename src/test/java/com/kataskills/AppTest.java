package com.kataskills;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by JC87 on 9/27/2016.
 */
public class AppTest {

    @Test
    public void checkYouHaveAEmptyListAtStart(){
        List<Integer> sortedBallTestList = new ArrayList<Integer>();
        assert(sortedBallTestList.equals(new SortingBalls().sortedBallList));
    }
}
