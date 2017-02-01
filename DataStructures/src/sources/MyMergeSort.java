package sources;

import java.util.Arrays;
import java.util.TreeSet;

public class MyMergeSort {
	
	
	int[] array;
	
	int totalIterations=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		


		MyMergeSort merge=new MyMergeSort(10);
		
		AllUtils.printArray(merge.array);
		
	}

	
	MyMergeSort(int size)
	{
		AllUtils arrayUtils= new AllUtils (size);
		this.array=arrayUtils.getArray();
		
		
	}
	
	
	
	void mergeSort(int array[])
	{
		
		
		
		
		
	}
	
}
