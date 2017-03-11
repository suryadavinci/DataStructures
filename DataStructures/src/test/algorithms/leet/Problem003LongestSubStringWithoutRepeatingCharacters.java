package test.algorithms.leet;

public class Problem003LongestSubStringWithoutRepeatingCharacters {

	public static int lengthOfLongestSubstring(String s) {

		StringBuilder current = new StringBuilder(s.substring(0, 1));
		StringBuilder max = new StringBuilder(s.substring(0, 1));

		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) != s.charAt(i - 1))
				current.append(s.charAt(i));
			else
				current = new StringBuilder(s.substring(i, i + 1));
			if (current.length() > max.length())
				max = new StringBuilder(current.toString());
		}
		return max.length();
	}

	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("hellodear"));
	}

}
