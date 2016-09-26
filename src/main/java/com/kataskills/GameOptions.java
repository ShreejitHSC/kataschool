package com.kataskills;

/**
 * Created by skakk2 on 9/26/2016.
 */
public class GameOptions {

    public enum GameInputOptions {
        ROCK("SCISSORS"),PAPER("ROCK"),SCISSORS("PAPER");

        private final String whoIsBeaten;
        GameInputOptions(String beatenValue) {
            this.whoIsBeaten = beatenValue;
        }
    }
}
