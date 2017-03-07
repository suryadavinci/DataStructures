package practice.algorithms.zoho;

import java.util.Arrays;

public class StringReverseNoPunctuation {

	public static void main(String[] args) {
		String x = "house no : 123@ cbe";
		char[] c = x.toCharArray();
		int l = c.length;
		char temp = ' ';
		int i = 0;

		int lp = 0, rp = l - 1;
		System.out.println(String.copyValueOf(c));
		while (lp < rp) {

			if ((c[lp] < 'a' && c[lp] > '9') || (c[lp] < '1') || c[lp] > 'z') {
				lp++;
			} else if ((c[rp] < 'a' && c[rp] > '9') || (c[rp] < '1') || c[rp] > 'z') {
				rp--;
			} else {
				temp = c[lp];
				c[lp] = c[rp];
				c[rp] = temp;
				rp--;
				lp++;
			}
		}
		System.out.println(String.copyValueOf(c));

		System.out.println(Arrays.asList(x.split(" ")));
		Arrays.sort(c);
		System.out.println(Arrays.toString(c));

	}
}
