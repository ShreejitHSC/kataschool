package com.kataskills;

import org.junit.Test;

/**
 * Created by skakk2 on 9/26/2016.
 */
public class RockPaperScissorsTest {

    @Test
    public void testWhenUserRockComputerScissors(){
        RockPaperScissors rockPaperScissors = new RockPaperScissors();
        String userInput = "ROCK";
        String computerInput = "SCISSORS";
        assert (rockPaperScissors.findWhoWins(computerInput, userInput).equalsIgnoreCase("User wins"));
    }
}
