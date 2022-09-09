package com.bridgelabz;

public class PrimeNoBetween1To100 {
    public static void main(String[] args) {
        int a = 1, b = 100;
        int temp = 0;
        System.out.print("From 1 to 100, prime numbers are: ");
        for (int i = a; i <= b; i++) {
            for (int n = 2; n < i; n++) {
                if (i % n == 0) {
                    temp = temp + 1;
                }
            }
            if (temp == 0) {
                System.out.print(i + " ");
            } else {
                temp = 0;
            }
        }
    }
}
