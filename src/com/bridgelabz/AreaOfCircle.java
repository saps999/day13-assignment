package com.bridgelabz;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        double radius = sc.nextDouble();

        double area = 3.14 * (radius * radius);

        System.out.println("Area of the formed circle is: " + area);
    }
}
