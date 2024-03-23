package com.kata;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class PrimeFactors {
    public static List<Integer> getPrimeFactors(int n) {
        List<Integer> primeFactors = new ArrayList<>();
        for (int fac = 2; fac <= n; fac++) {
            n = extractFactor(n, fac, primeFactors);
        }
        return primeFactors;
    }

    private static int extractFactor(int n, int fac, List<Integer> primeFactors) {
        while (n % fac == 0) {
            primeFactors.add(fac);
            n /= fac;

        }
        return n;
    }

        public static void main(String[] args) {
        Logger logger = Logger.getLogger(PrimeFactors.class.getName());
        logger.info("Iteration 4 of Kata");
    }
}
