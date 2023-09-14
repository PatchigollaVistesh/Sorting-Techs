package com.sort;

import java.util.Scanner;

public class BubbleSort {
	
	public static int[] sortByBubble(int[] array) {
		for(int i=0 ; i<array.length ; i++) {
			for(int j=0 ; j<array.length-i-1 ; j++) {
				if(array[j]>array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		
		return array;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] array = new int[size];
		for(int i=0; i<size; i++) {
			array[i] = sc.nextInt();
		}
		
		array = sortByBubble(array);
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}

}
