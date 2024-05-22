package com.junitexample;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.junitexample.CollatzValidator;

public class CollatzTest {
    private final CollatzValidator collatzValidator = new CollatzValidator();

    @Test
    void validate () {
        assertEquals (
            collatzValidator.validate(9),
            true
        );
        assertEquals(
            collatzValidator.validate(-8),
            false
        );
        assertEquals(
            collatzValidator.validate(42),
            true
        );
    }
}
