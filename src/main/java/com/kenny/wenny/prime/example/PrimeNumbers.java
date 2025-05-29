package com.kenny.wenny.prime.example;

public class PrimeNumbers {
    public boolean check(int number) {
        for (int i = number - 1; i >= 2; i--) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
