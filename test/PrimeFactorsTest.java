package test;

import com.kata.PrimeFactors;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class PrimeFactorsTest {
    private static void assertPrimeFactors(List<Integer> primeFactorsList, int number) {
        assertEquals(primeFactorsList, PrimeFactors.getPrimeFactors(number));
    }

    @Test
    public void primeFactorsOf1() {
        assertPrimeFactors(List.of(), 1);
    }

    @Test
    public void primeFactorsOf2Is2() {
        assertPrimeFactors(List.of(2), 2);
    }

    @Test
    public void primeFactorsOf3Is3() {
        assertPrimeFactors(List.of(3), 3);
    }

    @Test
    public void primeFactorsOf6Is2x3() {
        assertPrimeFactors(List.of(2, 3), 6);
    }

    @Test
    public void primeFactorsOf12Is2x2x3() {
        assertPrimeFactors(List.of(2, 2, 3), 12);
    }

    @Test
    public void integration() {
        assertPrimeFactors(List.of(2, 3, 5, 5), 150);
    }
}