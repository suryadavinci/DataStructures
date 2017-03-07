package practice.algorithms.zoho;

import java.util.Arrays;

public class MergeSortedArray {

	static int[] a = { 1, 3, 7, 21, 64 };
	static int[] b = { 4, 17, 38, 114 };
	static int[] merge;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		merge();

	}

	public static void merge() {

		System.out.println(Arrays.toString(a) + " " + Arrays.toString(b));

		merge = new int[a.length + b.length];

		int i = 0, j = 0, k = 0;

		int aMax = a.length;
		int bMax = b.length;

		while (i < a.length && j < b.length) {

			if (a[i] <= b[j]) {
				merge[k++] = a[i++];
			} else {
				merge[k++] = b[j++];
			}

		}

		if (i < aMax) {
			while (k < merge.length) {
				merge[k++] = a[i++];
			}
		}
		if (j < bMax) {
			while (k < merge.length) {
				merge[k++] = a[j++];
			}
		}

		System.out.println(Arrays.toString(merge));

	}

}
