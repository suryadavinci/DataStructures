package test.algorithms.dynamic;

public class LongestCommonSubSequence {

	int maxLen = 0;
	String[][] mem;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "ABCBDAB";
		String s2 = "BDCABA";

		LongestCommonSubSequence dynamic = new LongestCommonSubSequence();
		dynamic.mem = new String[s1.length()][s2.length()];
		dynamic.getDynamicLCS(s1, s2, "");

	}

	private void getDynamicLCS(String s1, String s2, String com) {

	}

	public void getLCS(String s1, String s2, String com) {

		if (s1.length() == 0 || s2.length() == 0) {
			if (com.length() >= this.maxLen) {
				this.maxLen = com.length();
				System.out.println(com);
			}

			return;
		} else {
			// System.out.println(s1+" "+s2+" "+com);
			if (s1.charAt(0) == s2.charAt(0)) {
				com = com + s1.charAt(0);
				getLCS(s1.substring(1), s2.substring(1), com);
			} else {
				getLCS(s1.substring(1), s2, com);
				getLCS(s1, s2.substring(1), com);
			}

		}

	}

}
