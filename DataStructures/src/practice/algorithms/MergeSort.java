package practice.algorithms;

import java.util.Arrays;

public class MergeSort {

	int[] array;
	int[] tempArray;

	MergeSort(int size) {
		array = new int[size];
		tempArray = new int[size];
	}

	public static void main(String[] args) {
		MergeSort merge = new MergeSort(8);
		merge.generateArray();
		System.out.println(Arrays.toString(merge.array));

		merge.partition(0, 7);
		System.out.println(Arrays.toString(merge.array));

	}

	void generateArray() {
		for (int i = 0; i < this.array.length; i++)
			array[i] = (int) (Math.random() * 50 + 10);
	}

	void partition(int left, int right) {
		int mid = 0;
		if (right > left) {
			mid = (left + right) / 2;

			// System.out.println("1 "+left+" "+right+" "+mid);
			partition(left, mid);
			partition(mid + 1, right);
			// System.out.println("2 "+left+" "+right+" "+mid);

			merge(left, mid, right);
		}
	}

	void merge(int low, int mid, int high) {

		for (int i = low; i <= high; i++) {
			tempArray[i] = array[i];
		}

		int i = low;
		int j = mid + 1;
		int k = low;
		while (i <= mid && j <= high) {
			if (tempArray[i] < tempArray[j]) {
				array[k++] = tempArray[i++];

			} else {
				array[k++] = tempArray[j++];
			}
		}

		while (i <= mid) {
			array[k++] = tempArray[i++];
		}

	}

}
