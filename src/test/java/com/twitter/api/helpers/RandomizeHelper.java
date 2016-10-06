package com.twitter.api.helpers;

import java.util.Random;

/**
 * Created by Alexander on 06.10.2016.
 */
public class RandomizeHelper {
    /**
     * Get random integer
     *
     * @param minValue int
     * @param maxValue int
     * @return Integer r_randomNumber
     */
    public static Integer getRandomInt(int minValue, int maxValue) {
        Random random = new Random();
        int randomNumber = 0;
        int delta = (maxValue + 1) - minValue;
        if (delta > 0) {
            randomNumber = random.nextInt(delta) + (minValue);
        }
        return randomNumber;
    }
}
