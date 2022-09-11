package com.bridgelabz.corejava.functional;

import java.util.Scanner;

public class SumOfThreeIntToZero {
	 public static void main(String[] args) {
	        int n;
	        int count = 0;
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter  number of inputs \n= ");
	        n = scanner.nextInt();

	        System.out.println("enter numbers : ");
	        int[] ar = new int[n];
	        for (int i = 0; i < n; i++) {
	            ar[i] = scanner.nextInt();
	        }

	        for (int i = 0; i < n; i++) {
	            for (int j = i + 1; j < n; j++) {
	                if (j != i) {
	                    for (int k = j + 1; k < n; k++) {
	                        if (k != i  && k != j) {
	                            if (ar[i] + ar[j] + ar[k] == 0) {
	                                System.out.println(ar[i]+" + "+ar[j]+" + "+ar[k]+" = 0");
	                                count++;
	                            }
	                        }
	                    }
	                }
	            }
	        }
	        System.out.println("no of triplets = "+count);
	    }
}
