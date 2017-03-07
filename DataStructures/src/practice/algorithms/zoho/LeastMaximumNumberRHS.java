package practice.algorithms.zoho;

import java.util.Arrays;

public class LeastMaximumNumberRHS {

	static int input[] = { 43, 3, 9, 45, 345, 24, 23, 53, 1, 95, 25, 32, 80 };

	// static int input[] = { 43, 3, 91, 95, 32, 80 };

	public static void main(String[] args) {
		System.out.println(Arrays.toString(input));

		int l = input.length;
		int k = 0, current = 0;
		for (int i = 0; i < l; i++) {
			k = i + 1;
			if (k == l) {
				input[i] = -1;
				break;
			}

			for (k = i + 1; k < l; k++) {
				if (input[k] > input[i])
					break;
			}

			if (k != l) {

				current = input[k];
			} else {
				current = input[i];
			}

			for (; k < l; k++) {
				if (input[k] > input[i] && input[k] < current) {
					current = input[k];
				}

			}
			if (input[i] == current)
				input[i] = -1;
			else
				input[i] = current;

		}

		System.out.println(Arrays.toString(input));

		quickSort(0, input.length - 1);

		System.out.println(Arrays.toString(input));

	}

	public static void quickSort(int left, int right) {
		int pivot;
		if (left >= right) {
			return;
		} else {
			pivot = right;

			int pivotLocation = partition(left, right, pivot);

			quickSort(left, pivotLocation - 1);
			quickSort(pivotLocation + 1, right);
		}
	}

	private static int partition(int left, int right, int pivot) {

		int leftPointer = left - 1;
		int rightPointer = right;

		while (true) {

			while (leftPointer < pivot && input[++leftPointer] < input[pivot])
				;
			while (rightPointer != 0 && input[--rightPointer] > input[pivot])
				;

			if (leftPointer >= rightPointer)
				break;

			// System.out.println("swaping "+input[leftPointer]+"
			// "+input[rightPointer]);
			// System.out.println("Before Swapping "+Arrays.toString(input));
			swap(leftPointer, rightPointer);
			// System.out.println("After Swapping "+Arrays.toString(input));
		}
		// System.out.println("Before Swapping "+Arrays.toString(input));

		// System.out.println("swaping "+input[left]+" "+input[pivot]);

		swap(leftPointer, pivot);
		// System.out.println("After Swapping "+Arrays.toString(input));

		return leftPointer;
	}

	private static void swap(int left, int pivot) {

		int temp = input[left];
		input[left] = input[pivot];
		input[pivot] = temp;
	}

}
