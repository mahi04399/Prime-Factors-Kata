package com.kata;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class PrimeFactors {

    public static List<Integer> getFactorsOf(int n) {
        List<Integer> primeFactors = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                primeFactors.add(i);
                n /= i;
            }
        }
        return primeFactors;
    }

    public static void main(String[] args) {
        Logger logger = Logger.getLogger(PrimeFactors.class.getName());
        logger.info("This is Third Kata Iteration");
    }
}
