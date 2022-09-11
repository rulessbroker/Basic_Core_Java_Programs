package com.bridgelabz.corejava.functional;

import java.util.Scanner;

public class Distance {
	public static void main(String[] args) {
        int x,y;
        double distance = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter integer \n x = ");
        x = scanner.nextInt();
        System.out.print("y = ");
        y = scanner.nextInt();

        distance = Math.sqrt(x * x + y * y);
        System.out.println("Distance from the Origin = "+distance);
    }
}
