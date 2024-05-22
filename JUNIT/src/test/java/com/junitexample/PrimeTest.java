package com.junitexample;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.junitexample.PrimeValidator;

public class PrimeTest {
    private final PrimeValidator primeValidator = new PrimeValidator();

    @Test
    void validate () {
        assertEquals(
            primeValidator.validate(2),
            true
        );

        assertEquals(
            primeValidator.validate(42),
            false
        );

        assertEquals(
            primeValidator.validate(17),
            true
        );
    }
}
