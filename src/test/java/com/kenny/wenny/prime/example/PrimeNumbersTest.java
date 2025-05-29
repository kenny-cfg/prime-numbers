package com.kenny.wenny.prime.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PrimeNumbersTest {
    private PrimeNumbers primeNumbers = new PrimeNumbers();

    @Test
    void worksFor11() {
        var result = primeNumbers.check(11);

        assertTrue(result);
    }

    @Test
    void worksFor12() {
        var result = primeNumbers.check(12);

        assertFalse(result);
    }

    @Test
    void worksFor2() {
        var result = primeNumbers.check(2);

        assertTrue(result);
    }
}