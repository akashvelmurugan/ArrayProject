package com.multidiamentionalarray;

import java.util.Scanner;

public class MultiDiamentionalArray {
	public static void main(String[] args) {
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

		System.out.println("Enter The Array Size :");
		Scanner scanner= new Scanner(System.in);
		int size = scanner.nextInt();
		int array[][]=new int[size][size];		
		for (int i = 0; i < size; i++) {
			for (int j = 0; j <size; j++) {
				array[i][j] = scanner.nextInt();
			}
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[i][j]+"  ");
			}
			System.out.println();
		}

	}

}
