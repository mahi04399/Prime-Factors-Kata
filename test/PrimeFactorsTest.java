package test;

import Primefactor.PrimeFactor;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class PrimeFactorsTest {
    @Test
    public void primeFactorsOf1Is(){
        Assert.assertEquals(List.of(), PrimeFactor.getFactorsOf(1));
    }

    @Test
    public void primeFactorsOf2Is2() {
        Assert.assertEquals(List.of(2), PrimeFactor.getFactorsOf(2));
    }

    @Test
    public void primeFactorsOf3Is3() {
        Assert.assertEquals(List.of(3), PrimeFactor.getFactorsOf(3));
    }

    @Test
    public void primeFactorsOf4IS4x4() {
        Assert.assertEquals(List.of(2,2), PrimeFactor.getFactorsOf(4));
    }

    @Test
    public void primeFactorsOf6Is2x3() {
        Assert.assertEquals(List.of(2,3), PrimeFactor.getFactorsOf(6));
    }

    @Test
    public void primeFactorsOf9Is3x3() {

        Assert.assertEquals(List.of(3,3), PrimeFactor.getFactorsOf(9));
    }

    @Test
    public void primeFactorsOf25Is5x5() {
        Assert.assertEquals(List.of(5,5), PrimeFactor.getFactorsOf(25));
    }

    @Test
    public void primeFactorsOf30Is2x3x5() {
        Assert.assertEquals(List.of(2,3,5), PrimeFactor.getFactorsOf(30));
    }

    @Test
    public void primeFactorsOf2x3x5x7x3x2x5x7x71IsSame() {
        Assert.assertEquals(List.of(2,2,3,3,5,5,7,7,71), PrimeFactor.getFactorsOf(2*3*5*7*3*2*5*7*71));
    }
}