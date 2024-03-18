package com.kata;

import java.util.ArrayList;
import java.util.List;

public class Factor {
    List<Integer> primeFactors = new ArrayList<>();

    public List<Integer> getPrimeFactors(Integer n) {

        for(int i=2 ; i<=Math.sqrt(n) ; i++) {
            if(isFactorAndPrime(n, i)) {
                buildPrimeFactorsList(n, i);
                return primeFactors;
            }
        }
        primeFactors.add(n);
        return primeFactors;
    }

    private void buildPrimeFactorsList(Integer n, int i) {
        primeFactors.add(i);
        getPrimeFactors(n / i);
    }

    private boolean isFactorAndPrime(Integer n, int i) {
        return n % i == 0 && isPrime(i);
    }

    private boolean isPrime(int n) {
        for(int i=2 ; i<=Math.sqrt(n) ; i++)
            if(n%i == 0) return false;
        return true;
    }
}