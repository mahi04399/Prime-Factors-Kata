package test;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.kata.Factor;

public class FactorTest {
    Factor primeFactorsDouble = new Factor();

    Map<Integer, List<Integer>> expectedActualMap = new HashMap<>();

    public void setExpectedActualMap(Map<Integer, List<Integer>> expectedActualMap) {
        this.expectedActualMap.put(2, List.of(2));
    }

    @Test
    public void primeFactorsOfTwoIsTwo() {
        Assert.assertEquals(List.of(2),primeFactorsDouble.getPrimeFactors(2));
    }

    @Test
    public void primeFactorsOfThreeIsThree() {
        Assert.assertEquals(List.of(3),primeFactorsDouble.getPrimeFactors(3));
    }

    @Test
    public void primeFactorsOfFourIsTwoTwo() {
        Assert.assertEquals(List.of(2, 2), primeFactorsDouble.getPrimeFactors(4));
    }

    @Test
    public void primeFactorsOfSix() {
        Assert.assertEquals(List.of(2,3), primeFactorsDouble.getPrimeFactors(6));
    }

    @Test
    public void primeFactorsOfNine() {
        Assert.assertEquals(List.of(3, 3), primeFactorsDouble.getPrimeFactors(9));
    }

    @Test
    public void primeFactorsOfFive() {
        Assert.assertEquals(List.of(5), primeFactorsDouble.getPrimeFactors(5));
    }

    @Test
    public void primeFactorsOfTen() {
        Assert.assertEquals(List.of(2,5), primeFactorsDouble.getPrimeFactors(10));
    }

    @Test
    public void primeFactorsOfFifteen() {
        Assert.assertEquals(List.of(3,5), primeFactorsDouble.getPrimeFactors(15));
    }

    @Test
    public void primeFactorsOf30() {
        Assert.assertEquals(List.of(2, 3, 5), primeFactorsDouble.getPrimeFactors(30));
    }

    @Test
    public void primeFactorsOf27(){
        Assert.assertEquals(List.of(3,3,3), primeFactorsDouble.getPrimeFactors(27));
    }

    @Test
    public void primeFactorsOf27x30x71(){
        Assert.assertEquals(List.of(2, 3,3,3,3, 5, 71), primeFactorsDouble.getPrimeFactors(27*30*71));
    }
}