package test.algorithms.gfg.dynamic;

public class LongestIncreasingSubsequence {
	static int[] a;
	public static void main(String[] args) {
		a=new int[]{9,21,41,60,17,99,80,120};
		System.out.println(lis(0,1));
	}
	
	public static int lis(int index, int count){
		if(index>=a.length)
			return 0;
		
		int value=a[index];
		while(index+1<a.length && value>a[index+1]){
			//System.out.println(value+" "+a[index++]);
			index++;
			}
			
		if(index>=a.length)
			return 0;
		else 
			count=1+lis(index+1,++count);
		
		return count;
	}
	
}
