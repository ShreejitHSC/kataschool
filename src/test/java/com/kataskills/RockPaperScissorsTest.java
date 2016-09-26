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
    public void userWinsWhenUserRockComputerScissors(){
        String userInput = "ROCK";
        String computerInput = "SCISSORS";
        assert (rockPaperScissors.findWhoWins(computerInput, userInput).equalsIgnoreCase("User wins"));
    }

    @Test
    public void computerWinsWhenUserRockComputerPaper() {
        String userInput = "rock";
        String computerInput = "paper";
        assert (rockPaperScissors.findWhoWins(computerInput, userInput).equalsIgnoreCase("Computer wins"));
    }

    @Test
    public void noOneWinsWhenUserRockComputerRock() {
        String userInput = "rock";
        String computerInput = "rock";
        assert (rockPaperScissors.findWhoWins(computerInput, userInput).equalsIgnoreCase("Draw"));
    }

    @Test
    public void userWinsWhenUserPaperComputerRock() {
        String userInput = "paper";
        String computerInput = "rock";
        assert (rockPaperScissors.findWhoWins(computerInput, userInput).equalsIgnoreCase("User wins"));
    }

    @Test
    public void computerWinsWhenUserPaperComputerScissors() {
        String userInput = "paper";
        String computerInput = "scissors";
        assert (rockPaperScissors.findWhoWins(computerInput, userInput).equalsIgnoreCase("Computer wins"));
    }

    @Test
    public void noOneWinsWhenUserPaperComputerPaper() {
        String userInput = "paper";
        String computerInput = "paper";
        assert (rockPaperScissors.findWhoWins(computerInput, userInput).equalsIgnoreCase("Draw"));
    }

    @Test
    public void computerWinsWhenUserScissorsComputerRock() {
        String userInput = "scissors";
        String computerInput = "rock";
        assert (rockPaperScissors.findWhoWins(computerInput, userInput).equalsIgnoreCase("Computer wins"));
    }

    @Test
    public void userWinsWhenUserScissorsComputerPaper() {
        String userInput = "scissors";
        String computerInput = "paper";
        assert (rockPaperScissors.findWhoWins(computerInput, userInput).equalsIgnoreCase("User wins"));
    }

    @Test
    public void noOneWinsWhenUserScissorsComputerScissors() {
        String userInput = "scissors";
        String computerInput = "scissors";
        assert (rockPaperScissors.findWhoWins(computerInput, userInput).equalsIgnoreCase("Draw"));
    }

}
