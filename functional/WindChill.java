package com.bridgelabz.corejava.functional;

import java.util.Scanner;

public class WindChill {
	 public static void main(String[] args) {
	        double t, v, w;
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter temperature below 50 \nt = ");
	        t = scanner.nextInt();

	        while (t > 50){
	            System.out.print("OOps...\nEnter temperature below 50 \nt = ");
	            t = scanner.nextInt();
	        }
	        System.out.print("enter speed betn range 3 to 120\nv = ");
	        v = scanner.nextInt();

	        while (v < 3 || v > 120){
	            System.out.print("OOps...\nenter speed betn range 3 to 120 \nv = ");
	            v = scanner.nextInt();
	        }

	        w = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
	        System.out.println("Wind Chill = "+w);
	    }
}
