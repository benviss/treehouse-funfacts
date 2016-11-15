package com.fisc.funfacts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by Guest on 11/14/16.
 */
public class ColorBook {
    private final Color[] mColor = new Color[]{

             };
    //Fields (Member Variables) - Properties about the object

    // Methods - Actions the object can take
    public String getFact() {

        String fact = "";
        // randomly select a fact, so update the fact TextView with a new fact
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mColor.length);


        return fact;
    }
}
