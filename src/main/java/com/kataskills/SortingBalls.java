package com.kataskills;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by JC87 on 9/27/2016.
 */
public class SortingBalls {
    public List<Integer> sortedBallList;

    public SortingBalls() {
        sortedBallList = new ArrayList<>();
    }

    public List<Integer> sortedList(int newBall){

        sortedBallList.add(newBall);
        return sortedBallList;
    }
}
