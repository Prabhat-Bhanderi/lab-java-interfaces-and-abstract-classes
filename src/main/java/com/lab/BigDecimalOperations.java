package com.lab;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalOperations {

    /**
     * Accepts a BigDecimal and returns a double rounded to the nearest hundredth.
     * 
     * @param number the BigDecimal number to round
     * @return a double rounded to the nearest hundredth
     */
    public static double roundToNearestHundredth(BigDecimal number) {
        BigDecimal rounded = number.setScale(2, RoundingMode.HALF_UP);
        return rounded.doubleValue();
    }

    /**
     * Accepts a BigDecimal, reverses the sign, rounds to the nearest tenth, and
     * returns the result.
     * 
     * @param number the BigDecimal number to process
     * @return a BigDecimal with reversed sign and rounded to the nearest tenth
     */
    public static BigDecimal reverseSignAndRoundToTenth(BigDecimal number) {
        BigDecimal negated = number.negate();
        return negated.setScale(1, RoundingMode.HALF_UP);
    }
}
