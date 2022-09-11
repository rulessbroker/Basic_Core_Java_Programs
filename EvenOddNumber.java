package com.bridgelabz.corejava;

import java.util.Scanner;

public class EvenOddNumber {
	   public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter The number = ");
	        int n = scanner.nextInt();

	        if (n % 2 == 0) {
	            System.out.println(n+" is even number");
	        }else {
	            System.out.println(n+" is odd number");
	        }
	    }
}
