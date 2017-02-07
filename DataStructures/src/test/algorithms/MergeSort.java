package test.algorithms;

import java.util.Arrays;

public class MergeSort {

	private int array[];
	private int tempArray[];
	private int length;
	
	public static void main(String[] args) {
		System.out.println("hello world");
		MergeSort ms=new MergeSort(new int[]{5,3,6,7,8,4,1,2});
		ms.printArray();
		

	}
	
	public MergeSort(int[] inputArray) {
		// TODO Auto-generated constructor stub
		
		this.array=inputArray;
		this.length=inputArray.length;
		this.tempArray=new int[this.length];
		this.printArray();
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



	private void merge(int low, int mid, int high) {
		
		
		System.out.println(low+" "+ mid+" "+high);
		System.out.println("current");
		printArray();
		System.out.println("temp");
		System.out.println(Arrays.toString(tempArray));
		for(int i=low;i<=high;i++)
			tempArray[i]=array[i];
		
		
		int i=low;
		int j=mid+1;
		int k=low;
		
		
		while(i<=mid && j<=high)
		{
			if(tempArray[i]<=tempArray[j]){
				array[k]=tempArray[i];
				i++;
			}
			else
			{
				array[k]=tempArray[j];
				j++;
			}
			k++;
		}
		
		while(i<=mid)
		{
			array[k]=tempArray[i];
			i++;
			k++;
			
		}

	}
	public void printArray()
	{
		System.out.println(Arrays.toString(this.array));
	}

}
