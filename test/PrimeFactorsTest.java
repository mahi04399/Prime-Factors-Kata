package test;

import com.kata.PrimeFactors;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class PrimeFactorsTest {
    @Test
    public void primeFactorsOf1Is(){
        Assert.assertEquals(List.of(), PrimeFactors.getFactorsOf(1));
    }

    @Test
    public void primeFactorsOf2Is2() {
        Assert.assertEquals(List.of(2), PrimeFactors.getFactorsOf(2));
    }

    @Test
    public void primeFactorsOf3Is3() {
        Assert.assertEquals(List.of(3), PrimeFactors.getFactorsOf(3));
    }

    @Test
    public void primeFactorsOf4IS2x2() {
        Assert.assertEquals(List.of(2,2), PrimeFactors.getFactorsOf(4));
    }

    @Test
    public void primeFactorsOf6Is2x3() {
        Assert.assertEquals(List.of(2,3), PrimeFactors.getFactorsOf(6));
    }

    @Test
    public void primeFactorsOf9Is3x3() {

        Assert.assertEquals(List.of(3,3), PrimeFactors.getFactorsOf(9));
    }

    @Test
    public void primeFactorsOf25Is5x5() {
        Assert.assertEquals(List.of(5,5), PrimeFactors.getFactorsOf(25));
    }

    @Test
    public void primeFactorsOf30Is2x3x5() {
        Assert.assertEquals(List.of(2,3,5), PrimeFactors.getFactorsOf(30));
    }

    @Test
    public void primeFactorsOf2x3x5x7x3x2x5x7x71IsSame() {
        Assert.assertEquals(List.of(2,2,3,3,5,5,7,7,71), PrimeFactors.getFactorsOf(2*3*5*7*3*2*5*7*71));
    }
}