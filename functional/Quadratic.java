package com.bridgelabz.corejava.functional;

import java.util.Scanner;

public class Quadratic {
	public static void main(String[] args) {
        double a, b, c;
        double delta, root1, root2;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter integer \n a = ");
        a = scanner.nextInt();
        System.out.print("b = ");
        b = scanner.nextInt();
        System.out.print("c = ");
        c = scanner.nextInt();

        delta = b * b - 4 * a * c;
        
        root1 = (- b + Math.sqrt(delta)) / (2 * a);
        root2 = (- b - Math.sqrt(delta)) / (2 * a);

        System.out.println("root 1 = "+root1);
        System.out.println("root 2 = "+root2);
    }
}
