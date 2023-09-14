package com.sort;
import java.util.*;


public class SelectionSort {
	public static int[] sortBySelection(int[] array) {
		for(int i=0; i<array.length; i++) {
			int index=i;
			for(int j=i; j<array.length-1; j++) {
				if(array[index] > array[j+1] ) {
					index = j+1;
				}
			}
			int temp = array[i];
			array[i] = array[index];
			array[index]=temp;
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
		
		array = sortBySelection(array);
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}

}
