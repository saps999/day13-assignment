package com.bridgelabz;

import java.util.Scanner;

public class Permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int n = sc.nextInt();
        System.out.println("Enter the number of seats: ");
        int r = sc.nextInt();
        int factorial1 = 1, factorial2 = 1, p;
        for (int i = n; i > 1; i--) {
            factorial1 *= i;
        }
        for (int i = n - r; i > 1; i--) {
            factorial2 *= i;
        }
        p = factorial1 / factorial2;
        System.out.println("Total possible arrangements: " + p + " ways.");
    }
}
