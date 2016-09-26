package com.kataskills;

import java.util.List;

import static java.util.Arrays.asList;

/**
 * Created by JC87 on 9/26/2016.
 */
public class App {

    public static void main(String[] argList) throws Exception {
        List<String> validInputValues = asList("rock", "paper", "scissors");

        if (argList.length != 1)
            throw new Exception("One input parameter is expected");

        if (validInputValues.contains(argList[0].toLowerCase())) {
            //Driver class to call the method
        } else {
            throw new Exception("The input provided is not a valid one");
        }
    }

    public static GameOptions.GameInputOptions generateComputerInput(int myRandomNumber) {
        //Generate a Random number between 1-3

        switch (myRandomNumber){
            case 1:
                return GameOptions.GameInputOptions.ROCK;
            case 2:
                return GameOptions.GameInputOptions.PAPER;
            case 3:
                return GameOptions.GameInputOptions.SCISSORS;
        }
        return null;
    }
}
