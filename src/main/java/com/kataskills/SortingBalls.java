package com.kataskills;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by JC87 on 9/27/2016.
 */
public class SortingBalls {
    public List<Integer> sortedBallList;

    public SortingBalls() {
        sortedBallList = new ArrayList<>();
    }

    public int drawANewBall(int newBall){
        return newBall;
    }

    public List<Integer> sortedList(){
        sortedBallList.add(drawANewBall(0));
        return sortedBallList;
    }
}
