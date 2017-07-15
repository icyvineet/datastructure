package datastructure.sorting.quick;

import java.util.Arrays;

public class QuickSortSelf {

	public static void swap(int[] input, int first, int last) {
		int tmp = input[first];
		input[first] = input[last];
		input[last] = tmp;
	}

	public static void quickSort(int[] input, int first, int last) {
		System.out.println();
		for(int i : input){System.out.print(i + " ");}
		System.out.println();
		// lets identify the pivot
		int pivot = last;

		// loop through from first till pivot
		while (first <= last) {
			if (input[first] < input[pivot]) {
				first++;
			} else {
				swap(input, first, last);
			}
		}

		/*while (last > pivot) {
			if (input[last] < input[pivot]) {
				swap(input, last, pivot);
				quickSort(input, pivot,last);
			} else {
				last--;
			}

		}*/
	}

	public static void main(String[] args) {
		int[] input = { 5, 3, 2, 4, 5, 6, 3, 1 };
		for(int i : input){System.out.print(i + " ");}
		quickSort(input,0,input.length-1);
		for(int i : input){System.out.print(i + " ");}
	}

}
