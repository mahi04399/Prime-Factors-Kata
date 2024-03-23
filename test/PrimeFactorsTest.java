package test;

import com.kata.PrimeFactors;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class PrimeFactorsTest {
    private static void assertPrimeFactorsOf(int number, List<Integer> primeFactorsList) {
        assertEquals(primeFactorsList, getPrimeFactors(number));
    }

    private static List<Integer> getPrimeFactors(int number) {
        return PrimeFactors.getPrimeFactors(number);
    }

    @Test
    public void primeFactorsOf1() {
        assertPrimeFactorsOf(1, List.of());
    }

    @Test
    public void primeFactorsOf2Is2() {
        assertPrimeFactorsOf(2, List.of(2));
    }

    @Test
    public void primeFactorsOf3Is3() {
        assertPrimeFactorsOf(3, List.of(3));
    }

    @Test
    public void primeFactorsOf6Is2x3() {
        assertPrimeFactorsOf(6, List.of(2, 3));
    }

    @Test
    public void primeFactorsOf12Is2x2x3() {
        assertPrimeFactorsOf(12, List.of(2, 2, 3));
    }

    @Test
    public void integration() {
        assertPrimeFactorsOf(150, List.of(2, 3, 5, 5));
    }
}