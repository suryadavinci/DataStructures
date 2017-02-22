package test.algorithms;

import java.util.Arrays;
import java.util.LinkedList;

import sources.AllUtils;

public class InsertionSort {

	int[] array;
	int size;

	InsertionSort(int size) {
		this.array = new int[size];
		AllUtils.generateRandomIntArray(size, 1, size);
		this.size = size;
	}

	InsertionSort(int[] array) {
		this.array = array;
		this.size = array.length;
	}

	public static void main(String[] args) {

		InsertionSort sort = new InsertionSort(10);
		System.out.println(Arrays.toString(sort.array));
		sort.sort();
		System.out.println(Arrays.toString(sort.array));

	}

	public static int[] sort(int[] array) {

		InsertionSort sort = new InsertionSort(array);
		sort.sort();

		return sort.array;
	}

	public void sort() {

		int low = 0, j = 0;
		for (int i = 1; i < this.size; i++) {
			low = array[i];
			for (j = i - 1; j >= 0; j--) {
				if (array[j] > low)
					array[j + 1] = array[j];
				else
					break;

			}
			array[j + 1] = low;

		}

	}

}
