package com.kata;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class PrimeFactors {
    public static List<Integer> getPrimeFactors(int n) {
        List<Integer> primeFactors = new ArrayList<>();
        for (int factor = 2; factor <= n; factor++) {
            n = extractFactor(n, factor, primeFactors);
        }
        return primeFactors;
    }

    private static int extractFactor(int n, int factor, List<Integer> primeFactors) {
        while (isDivisible(n, factor)) {
            primeFactors.add(factor);
            n /= factor;
        }
        return n;
    }

    private static boolean isDivisible(int n, int fac) {
        return n % fac == 0;
    }

    public static void main(String[] args) {
        Logger logger = Logger.getLogger(PrimeFactors.class.getName());
        logger.info("Iteration 4 of Kata");
    }
}
