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

    @Test
    public void testWhenUserRockComputerPaper() {
        String userInput = "rock";
        String computerInput = "paper";
        assert (rockPaperScissors.findWhoWins(computerInput, userInput).equalsIgnoreCase("Computer wins"));
    }

    @Test
    public void testWhenUserRockComputerRock() {
        String userInput = "rock";
        String computerInput = "rock";
        assert (rockPaperScissors.findWhoWins(computerInput, userInput).equalsIgnoreCase("Draw"));
    }

    @Test
    public void testWhenUserPaperComputerRock() {
        String userInput = "paper";
        String computerInput = "rock";
        assert (rockPaperScissors.findWhoWins(computerInput, userInput).equalsIgnoreCase("User wins"));
    }

    @Test
    public void testWhenUserPaperComputerScissors() {
        String userInput = "paper";
        String computerInput = "scissors";
        assert (rockPaperScissors.findWhoWins(computerInput, userInput).equalsIgnoreCase("Computer wins"));
    }

    @Test
    public void testWhenUserPaperComputerPaper() {
        String userInput = "paper";
        String computerInput = "paper";
        assert (rockPaperScissors.findWhoWins(computerInput, userInput).equalsIgnoreCase("Draw"));
    }

    @Test
    public void testWhenUserScissorsComputerRock() {
        String userInput = "scissors";
        String computerInput = "rock";
        assert (rockPaperScissors.findWhoWins(computerInput, userInput).equalsIgnoreCase("Computer wins"));
    }

    @Test
    public void testWhenUserScissorsComputerPaper() {
        String userInput = "scissors";
        String computerInput = "paper";
        assert (rockPaperScissors.findWhoWins(computerInput, userInput).equalsIgnoreCase("User wins"));
    }

    @Test
    public void testWhenUserScissorsComputerScissors() {
        String userInput = "scissors";
        String computerInput = "scissors";
        assert (rockPaperScissors.findWhoWins(computerInput, userInput).equalsIgnoreCase("Draw"));
    }

}
