package com.bridgelabz;

import java.util.Scanner;

public class ShakeHands {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of person: ");
        int N = sc.nextInt();
        int handShakes=((N-1)*N)/2;
        System.out.println("Maximum number of handshakes for "+N+" people is: "+handShakes);
    }
}
