package com.junitexample;


public class PrimeValidator {
    public Boolean validate (int num) {

        for(int i = 2; i < num; i++){
            if ((num % i) == 0){
                return false;
            }
        }
        return true;
    }
}
