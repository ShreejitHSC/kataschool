package com.kataskills;

import org.junit.Test;

/**
 * Created by skakk2 on 9/26/2016.
 */
public class RockPaperScissorsTest {

    @Test
    public void testWhenUserRockComputerScissors(){
        RockPaperScissors rockPaperScissors;
        String userInput = "rock";
        String computerInput = "scissors";
        assert (rockPaperScissors.findWhoWins(computerInput, userInput).equalsIgnoreCase("User wins"));
    }
}
