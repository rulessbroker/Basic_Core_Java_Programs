package com.bridgelabz.corejava.functional;

import java.util.Scanner;

public class TwoDimentionalArray {
	public static void main(String[] args) {
        int M = 2;    //rows
        int N = 3;    //columns

        Scanner scanner = new Scanner(System.in);

        int arr[][] = new int[M][N];
        System.out.println("Enter Numbers : ");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print("ar["+i+"]["+j+"]= ");
                arr[i][j]=scanner.nextInt();
            }
        }
        System.out.println("Printing Array : ");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
