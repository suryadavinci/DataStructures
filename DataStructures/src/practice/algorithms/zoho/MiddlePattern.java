package practice.algorithms.zoho;

import java.util.Arrays;

public class MiddlePattern {

	public static void main(String[] a) {
		String s = "PROGRAM";

		char[] c = s.toCharArray();

		int mid = c.length / 2;
		int i = mid;
		StringBuilder sout = new StringBuilder("");
		int l = c.length * 2;

		while (i < s.length() && i != mid - 1) {
			if (i < s.length() && i >= mid) {

				sout.append(s.charAt(i));
				System.out.println(getSpaces(l) + sout);
				l = l - 2;
				i++;
			}

			if (i == c.length) {
				i = 0;
			}
			if (i < mid) {
				sout.append(s.charAt(i));
				System.out.println(getSpaces(l--) + sout);
				l = l - 2;
				i++;
				if (i == mid - 1) {
					sout.append(s.charAt(mid - 1));
					break;
				}
			}

		}

		System.out.println(getSpaces(l) + sout);

	}

	public static String getSpaces(int n) {
		char[] spaces = new char[n];
		Arrays.fill(spaces, ' ');

		return String.copyValueOf(spaces);
	}
}
