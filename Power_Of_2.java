package com.bridgelabz.corejava;

import java.util.Scanner;

public class Power_Of_2 {
	 public static void main(String[] args) {
	        int powerOf2 = 1;
	        int N;
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("enter power for 2 = ");
	        N = scanner.nextInt();

	        while (N < 0 || N > 31){
	            System.out.print("enter power betn 0 to 31 = ");
	            N = scanner.nextInt();
	        }


	        for (int i = 0; i < N; i++) {
	            powerOf2 = powerOf2 * 2;
	        }
	        System.out.println("2^" + N + " = " + powerOf2);
	    }
}