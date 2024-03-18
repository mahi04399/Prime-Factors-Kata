package test;

import com.kata.PrimeFactors;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class PrimeFactorsTest {
    @Test
    public void primeFactorsOf1Is() {
        Assert.assertEquals(List.of(), PrimeFactors.find(1));
    }

    @Test
    public void primeFactorOf2IS2() {
        Assert.assertEquals(List.of(2), PrimeFactors.find(2));
    }

    @Test
    public void primeFactorsOf3Is3() {
        Assert.assertEquals(List.of(3), PrimeFactors.find(3));
    }

    @Test
    public void primeFactorsOf2x2() {
        Assert.assertEquals(List.of(2,2), PrimeFactors.find(4));
    }

    @Test
    public void primeFactorsOf3x3() {
        Assert.assertEquals(List.of(3,3), PrimeFactors.find(9));
    }

    @Test
    public void primeFactorsOf2x3() {
        Assert.assertEquals(List.of(2,3),PrimeFactors.find(6));
    }

    @Test
    public void primeFactorsOf2x3x5() {
        Assert.assertEquals(List.of(2,3,5), PrimeFactors.find(2*3*5));
    }

    @Test
    public void primeFactorsOf2x2x3x5x5x71() {
        Assert.assertEquals(List.of(2,2,3,5,5,71), PrimeFactors.find(2*2*3*5*5*71));
    }
}
