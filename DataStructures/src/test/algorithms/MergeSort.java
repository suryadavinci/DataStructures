package test.algorithms;

public class MergeSort {

	private int array[];
	private int tempArray[];
	private int length;
	
	public static void main(String[] args) {
		new MergeSort(new int[]{5,3,6,7,8,4,1,2});
	}
	
	public MergeSort(int[] inputArray) {
		// TODO Auto-generated constructor stub
		
		this.array=inputArray;
		this.length=inputArray.length;
		this.tempArray=new int[this.length];
		this.doMergeSort(0,this.length-1);
	}
	
	
	
	private void doMergeSort(int left, int right)
	{
		int mid;
		if(left<right)
		{
			mid=(left+right)/2;
			
			doMergeSort(left, mid);
			
			doMergeSort(mid+1, right);
			
			this.merge(left,mid,right);
			
			
		}
		
	}



	private void merge(int left, int mid, int right) {
		
		
		System.out.println(left+" "+ mid+" "+right);
		// TODO Auto-generated method stub
		/*for(int i=left;i<=right;i++)
		{
			if(array[left]<array[right])
				tempArray[]
		}*/
	}

}
