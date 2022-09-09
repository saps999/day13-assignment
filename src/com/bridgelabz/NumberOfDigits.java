package com.bridgelabz;

import java.util.Scanner;

public class NumberOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        int length=0;

        // using String.
        /*String str = "";
        str += num;
        length = str.length();*/

        // using loop.
        while (num!=0){
            length+=1;
            num=num/10;
        }

        System.out.println("Number of digits: " + length);
    }
}
