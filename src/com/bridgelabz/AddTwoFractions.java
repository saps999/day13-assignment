package com.bridgelabz;

import java.util.Scanner;

public class AddTwoFractions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking 1st fraction.
        System.out.print("Enter numerator of first fraction: ");
        int numerator1 = sc.nextInt();
        System.out.print("Enter denominator of first fraction: ");
        int denominator1 = sc.nextInt();
        // Taking 2nd fraction.
        System.out.print("Enter numerator of second fraction: ");
        int numerator2 = sc.nextInt();
        System.out.print("Enter denominator of second fraction: ");
        int denominator2 = sc.nextInt();
        // Adding two fraction.
        System.out.print("Added Fraction is ( " + numerator1 + " / " + denominator1 + " ) + ( " + numerator2 + " / " + denominator2 + " ) = ");

        int numerator = (numerator1 * denominator2) + (denominator1 * numerator2);
        int denominator = denominator1 * denominator2;
        int hcf = 0;

        for (int i = 1; i < numerator || i < denominator; i++) {
            if (numerator % i == 0 && denominator % i == 0) {
                hcf = i;
            }
        }
        System.out.print( numerator / hcf + " / " + denominator / hcf);
    }
}
