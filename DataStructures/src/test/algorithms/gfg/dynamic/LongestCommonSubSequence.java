package test.algorithms.gfg.dynamic;

import java.util.HashMap;
import java.util.Scanner;

public class LongestCommonSubSequence {
	static HashMap<String, Integer> mem;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		String s1;
		String s2;
		int t = s.nextInt();
		for (int i = 0; i < t; i++) {
			mem = new HashMap<String, Integer>();
			s.nextInt();
			s.nextInt();
			s1 = s.next();
			s2 = s.next();
			System.out.println(getCommonSubSequence(s1, s2));
		}
		s.close();
	}

	public static int getCommonSubSequence(String str1, String str2) {

		int maxLength = 0;
		if (str1.length() == 0 || str2.length() == 0)
			return 0;

		if (mem.containsKey(str1 + "-" + str2))
			return mem.get(str1 + "-" + str2);

		if (str1.charAt(0) == str2.charAt(0)) {
			{
				System.out.print(str1.charAt(0));
				maxLength = 1 + getCommonSubSequence(str1.substring(1), str2.substring(1));
			}
		} else {
			maxLength = Math.max(getCommonSubSequence(str1, str2.substring(1)),
					getCommonSubSequence(str1.substring(1), str2));
		}

		mem.put(str1 + "-" + str2, maxLength);
		System.out.println(mem);
		return maxLength;

	}

}
