package test.algorithms;

import java.util.Arrays;

import sources.AllUtils;

public class MergeSort {

	private int array[];
	private int tempArray[];
	private int length;

	public static void main(String[] args) {

		long start = 0;
		long end = 0;
		
		int arraySize=1000000;
		
		start = System.currentTimeMillis();
		MergeSort ms = new MergeSort(arraySize);
		end = System.currentTimeMillis();
		System.out.println("Merge Sort Time " + (end-start));
		//ms.printArray();

		start = System.currentTimeMillis();
		QuickSort qs = new QuickSort(arraySize);
		qs.quickSort(0, arraySize - 1);
		end = System.currentTimeMillis();
		System.out.println("Quick Sort Time " + (end-start));
		//qs.printArray();

	}

	public MergeSort(int size) {
		// TODO Auto-generated constructor stub

		this.array = AllUtils.generateRandomArray(size);
		this.length = size;
		this.tempArray = new int[this.length];
		// this.printArray();
		this.doMergeSort(0, this.length - 1);
	}

	private void doMergeSort(int left, int right) {
		int mid;
		if (left < right) {
			mid = (left + right) / 2;

			doMergeSort(left, mid);

			doMergeSort(mid + 1, right);

			this.merge(left, mid, right);

		}

	}

	private void merge(int low, int mid, int high) {

		// System.out.println(low+" "+ mid+" "+high);
		// System.out.println("current");
		// printArray();
		// System.out.println("temp");
		// System.out.println(Arrays.toString(tempArray));
		for (int i = low; i <= high; i++)
			tempArray[i] = array[i];

		int i = low;
		int j = mid + 1;
		int k = low;

		while (i <= mid && j <= high) {
			if (tempArray[i] <= tempArray[j]) {
				array[k] = tempArray[i];
				i++;
			} else {
				array[k] = tempArray[j];
				j++;
			}
			k++;
		}

		while (i <= mid) {
			array[k] = tempArray[i];
			i++;
			k++;

		}

	}

	public void printArray() {
		System.out.println(Arrays.toString(this.array));
	}

}
