package test.algorithms;

import java.util.LinkedList;

public class InsertionSort {

	static LinkedList<Integer> handList = new LinkedList<Integer>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x[] = { 5, 1, 11, 6, 2, 3, 0, 43, 12, 34, 6 };

		new InsertionSort().insertionSort(x);
		System.out.println(handList);

	}

	public void insertionSort(int x[]) {

		System.out.println(handList);
		handList.add(x[0]);

		int handSize = 0;
		for (int i = 1; i < x.length; i++) {
			System.out.println("checking " + x[i] + " in " + handList);
			handSize = handList.size();

			for (int j = 0; j < handSize; j++) {

				if (handList.get(j) > x[i]) {
					handList.add(j, x[i]);
					break;
				}
				if (j == handSize - 1)
					handList.add(x[i]);

			}

		}
	}

	public static void insertionSortArray(int[] x) {

		for (int i = 1; i < x.length; i++) {

		}

	}

}
