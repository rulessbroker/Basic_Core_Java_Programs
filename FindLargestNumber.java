package com.bridgelabz.corejava;

import java.util.Scanner;

public class FindLargestNumber {
	   public static void main(String[] args) {
	        int x,y,z;
	        int max;
	        System.out.print("Enter Three Numbers:");
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("   x = ");
	        x = scanner.nextInt();
	        System.out.print("y = ");
	        y = scanner.nextInt();
	        System.out.print("z = ");
	        z = scanner.nextInt();

	        max = x;
	        if (y > max){
	            max = y;
	        }
	        if (z > max){
	            max = z;
	        }
	        System.out.println("Largest Number = "+max);
	        
	    }
}
