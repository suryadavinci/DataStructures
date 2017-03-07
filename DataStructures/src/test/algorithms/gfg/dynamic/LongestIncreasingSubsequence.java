package test.algorithms.gfg.dynamic;

public class LongestIncreasingSubsequence {
	static int[] a;
	// static HashMap<Integer, Integer> mem;
	static int[] mem;
	static int memMax = 0;

	public static void main(String[] args) {
		// a=new int[]{9,21,41,60,17,99,80,120};
		a = new int[] { 68, 35, 1, 70, 25, 79, 59, 63, 65, 6, 46, 82 };
		// a=new int[]{24,10,22,9,33,21,50,41,60,80};
		// a=new int[]{2,1,4,7,3,9};
		// a=new int[]{62,92, 96, 43, 28, 37, 92, 5, 3, 54, 93, 83, 22 };
		mem = new int[a.length];
		mem[a.length - 1] = 1;
		// System.out.println(lis(4));
		for (int j = 0; j < a.length; j++)
			System.out.println(j + " " + lis(j) + " what???\n");

		System.out.println(memMax);
	}

	public static int lis(int index) {

		// if(index==a.length-1)return 1;

		if (mem[index] != 0)
			return mem[index];

		int maxCount = 0, curr = 0;

		for (int i = index + 1; i < a.length; i++) {
			curr = 1;
			if (a[i] > a[index]) {
				curr = curr + lis(i);
				System.out.println(i + " " + a[i]);
			}

			if (curr > maxCount)
				maxCount = curr;

		}

		mem[index] = maxCount;
		if (maxCount > memMax)
			memMax = maxCount;
		System.out.println(" max " + maxCount);
		return maxCount;

	}

}
