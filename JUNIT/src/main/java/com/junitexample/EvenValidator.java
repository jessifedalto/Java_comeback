package com.junitexample;

public class EvenValidator {
    public Boolean validate(int num) {
        if ((num % 2) == 1) 
            return false;
        
        return true;
    }
}
