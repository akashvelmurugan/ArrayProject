package com.jaggedarray;

public class JaggedArray {
	public static void main(String[] args) {
		int r=5;
		int arr[][]= new int[r][];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=new int [i+1];
		}
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j]=count++;
			}
		}
		System.out.println("Jagged Array");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
