package test.algorithms.gfg.dynamic;

public class LongestIncreasingSubsequence {
	static int[] a;
	//static HashMap<Integer, Integer> mem;
	static int[] mem;
	public static void main(String[] args) {
		//a=new int[]{9,21,41,60,17,99,80,120};
		a=new int[]{68,35,1,70,25,79,59,63,65,6,46,82};
		//a=new int[]{24,10,22,9,33,21,50,41,60,80};

		
		mem=new int[a.length];
		
		for(int j=0;j<a.length;j++)
		System.out.println(lis(j));
		
		for(int i=0;i<mem.length;i++)
			System.out.println(i+" "+mem[i]);
	}
	
	public static int lis(int index){
		
		int count=1;
		
		if(mem[index]!=0){
			System.out.println("already available "+index+" "+mem[index]);return mem[index];
		}
		
		
		for(int i=index;i<a.length;i++){
			//System.out.println(a[index]+" "+a[i]);
			if(a[index]<a[i])
				{
					count=count+lis(i);
					break;
				}
		}
		
		mem[index]=count;
		return count;
	}
	
}
