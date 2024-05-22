package com.junitexample;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.junitexample.EvenValidator;

public class EvenNumTest {
    private final EvenValidator evenValidator = new EvenValidator();

    @Test
    void validate() {
        assertEquals(
            evenValidator.validate(0),
            true
        );

        assertEquals(
            evenValidator.validate(1),
            false
        );
        assertEquals(
            evenValidator.validate(3),
            false
        );
 
        assertEquals(
            evenValidator.validate(6),
            true
        );
 
        assertEquals(
            evenValidator.validate(5),
            false
        );
 
    }
}
