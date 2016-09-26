package com.kataskills;

import org.junit.Test;

/**
 * Created by JC87 on 9/26/2016.
 */
public class AppTest {

    @Test(expected = Exception.class)
    public void testArgsLength() throws Exception {
        String[] argList = new String[]{};
        App.main(argList);
    }

    @Test(expected = Exception.class)
    public void testArgIsValid() throws Exception {
        String[] argList = new String[]{""};
        App.main(argList);
    }

    @Test
    public void testRandomNumber1IsCorrectlyConverted(){
        int myRandomNumber = 1;
        assert(App.generateComputerInput(myRandomNumber).equals(GameOptions.GameInputOptions.ROCK));
    }

    @Test
    public void testRandomNumber2IsCorrectlyConverted(){
        int myRandomNumber = 2;
        assert(App.generateComputerInput(myRandomNumber).equals(GameOptions.GameInputOptions.PAPER));
    }

    @Test
    public void testRandomNumber3IsCorrectlyConverted(){
        int myRandomNumber = 3;
        assert(App.generateComputerInput(myRandomNumber).equals(GameOptions.GameInputOptions.SCISSORS));
    }
}
