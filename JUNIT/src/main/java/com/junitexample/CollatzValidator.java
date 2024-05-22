package com.junitexample;

public class CollatzValidator {
    public Boolean validate (int num) {
        if (num < 1)
            return false;

        while (num != 1) {
            if (num % 2 == 0) 
                num /= 2;
            else
                num = (num * 3) + 1;
            System.out.println(num);
        }
        return true;
    }
}
