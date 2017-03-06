package test.algorithms.gfg.dynamic;

public class LongestIncreasingSubsequence {
	static int[] a;
	public static void main(String[] args) {
		a=new int[]{10,22,9,33,21,50,41,60,80};
		System.out.println(lis(1,0));
	}
	
	public static int lis(int index, int count){
		int value=a[index-1];
		while(index<a.length && value>a[index++])System.out.println(value+" "+a[index]);;
			
		if(index>=a.length)
			return count;
		else 
			count=count+lis(index,++count);
		
		return count;
	}
	
}
