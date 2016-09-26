package com.kataskills;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by skakk2 on 9/26/2016.
 */
public class RockPaperScissorsTest {

    RockPaperScissors rockPaperScissors;

    @Before
    public void before() {
        rockPaperScissors = new RockPaperScissors();
    }

    @Test
    public void testWhenUserRockComputerScissors(){
        String userInput = "ROCK";
        String computerInput = "SCISSORS";
        assert (rockPaperScissors.findWhoWins(computerInput, userInput).equalsIgnoreCase("User wins"));
    }

    

}
