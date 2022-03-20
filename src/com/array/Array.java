package com.array;

public class Array {
	public static void main(String[] args) {

		int[] age= {12,13,14,15,16,17,18};
		for (int i : age) {
			System.out.print(i+" ");
		}
		System.out.println();
		age[1]=15;
		for (int i : age) {
			System.out.print(i+" ");
		}
		System.out.println();
		int array[]= new int[5]; 
		array[0]=1;
		array[1]=2;
		array[2]=3;
		array[3]=4;
		array[4]=5;
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}
}
