package practice.algorithms.zoho;

public class StringCombinations {

	static int count = 0;

	static String input;
	static int len;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		input = "abc";
		len = input.length();

		// permute("", "surya");
		for (int i = 1; i <= 3; i++)
			permute("", i);
	}

	public static void permute(String prefix, String input) {
		int len = input.length();
		if (len == 0) {
			System.out.println(++count + " " + prefix);
			return;
		}

		for (int i = 0; i < len; i++) {

			permute(prefix + "" + input.charAt(i), input.substring(0, i) + input.substring(i + 1, len));
		}

	}

	public static void permute(String prefix, int k) {

		if (k == 0) {
			System.out.println(++count + "\t " + prefix);
			return;
		}

		for (int i = 0; i < len; i++) {

			permute(prefix + "" + input.charAt(i), k - 1);
		}

	}

}
