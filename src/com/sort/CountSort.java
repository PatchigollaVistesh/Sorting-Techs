package com.sort;

import java.util.*;
		

public class CountSort {
	
	public static int[] sortByCount(int[] array, int maxElement) {
		
		int[] countArray = new int[maxElement+1];
			
		for(int i=0;i<array.length;i++) {
			countArray[array[i]]++;
		}
		
		for(int i=1;i<countArray.length;i++) {
			countArray[i] += countArray[i-1];
		}
		
		int[] sortedArray = new int[array.length];
		
		int i = array.length-1;
		while(i>=0) {
			sortedArray[--countArray[array[i]]] = array[i];
			i--;
		}
		return sortedArray;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}
		
		int maxElement = Integer.MIN_VALUE;
		for(int i=0;i<array.length;i++) {
			maxElement = Math.max(maxElement,array[i]);
		}
		
		int[] finalSortedArray = new int[array.length];
		finalSortedArray = sortByCount(array, maxElement);
		for (int i = 0; i < finalSortedArray.length; i++) {
			System.out.print(finalSortedArray[i] + " ");
		}
	}

}
