package com.kataskills;

import org.junit.Before;
import org.junit.Test;
import org.junit.rules.ExpectedException;

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
}