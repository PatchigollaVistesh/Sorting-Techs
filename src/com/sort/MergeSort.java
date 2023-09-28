package com.sort;

import java.util.Scanner;
import java.util.ArrayList;

public class MergeSort {
	public static void sortByMerge(int[] array, int low, int high) {
//		int n = array.length;
		if (low >= high)
			return;
		else {
			int mid = (low + high) / 2;
			sortByMerge(array, low, mid); // left half of the array
			sortByMerge(array, mid + 1, high); // right half of the array

			merge(array, low, mid, high); // to arrange them in order
		}
	}

	public static void merge(int[] array, int low, int mid, int high) {
		int left = low;
		int right = mid + 1;
		ArrayList<Integer> temp = new ArrayList<>();

		while (left <= mid && right <= high) {
			if (array[left] <= array[right]) {
				temp.add(array[left]);
				left++;
			} else {
				temp.add(array[right]);
				right++;
			}
		}
		while (left <= mid) {
			temp.add(array[left]);
			left++;
		}
		while (right <= high) {
			temp.add(array[right]);
			right++;
		}

		for (int i = low; i <= high; i++) {
			array[i] = temp.get(i - low);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}

		sortByMerge(array, 0, size - 1);

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
