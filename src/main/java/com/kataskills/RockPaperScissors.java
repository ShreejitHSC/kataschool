package com.kataskills;

/**
 * Created by skakk2 on 9/26/2016.
 */
public class RockPaperScissors {


    public String findWhoWins(String computerInput, String userInput) {
        GameOptions.GameInputOptions computerValue = GameOptions.GameInputOptions.valueOf(computerInput.toUpperCase());
        GameOptions.GameInputOptions userValue = GameOptions.GameInputOptions.valueOf(userInput.toUpperCase());

        int result = computerValue.checkWhoWins(userValue);
        switch (result){
            case 0:
                return "Draw";
            case 1:
                return "Computer wins";
            case -1:
                return "User wins";
        }
        return null;
    }
}
