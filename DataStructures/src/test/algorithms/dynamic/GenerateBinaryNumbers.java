package test.algorithms.dynamic;

import java.util.Arrays;

public class GenerateBinaryNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 100;
		String[] a = new String[n];
		a[0] = "0";
		a[1] = "1";

		for (int i = 2; i < n; i++) {

			a[i] = a[i / 2] + "" + i % 2;
		}
		System.out.println(Arrays.toString(a));

	}

}
