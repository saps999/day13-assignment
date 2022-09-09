package com.bridgelabz;

import java.util.Scanner;

public class ReplaceZeroWithOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        String str1 = Integer.toString(number);
        int length = str1.length();
        String str2 = "";
        for (int i = 0; i < length; i++) {
            if (str1.charAt(i) == '0') {
                str2 += '1';
            } else str2 += str1.charAt(i);
        }
        System.out.println("Converted number is: " + str2);
    }
}
