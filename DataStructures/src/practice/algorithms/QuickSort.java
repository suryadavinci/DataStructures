package practice.algorithms;

import java.util.Arrays;

public class QuickSort {
	
	private int[] array;
	private int iterations;
	private int swapCount;
	private int recursionCount;
	private int loopCount;
	
	
	
	QuickSort(int size){
		this.array=new int[size];
		this.iterations=0;
		this.swapCount=0;
		this.recursionCount=0;
		this.loopCount=0;
	}
	
	
	
	public static void main(String[] args) {
		
		QuickSort quick = new QuickSort(10);
		quick.generateArray();

		System.out.println(Arrays.toString(quick.array));
		quick.quickSort(0,quick.array.length-1);
		
		System.out.println(Arrays.toString(quick.array));
		System.out.println(quick.iterations);
		System.out.println(quick.swapCount+" "+quick.loopCount+" "+quick.recursionCount);
		
		
	}
	
	void generateArray(){
		for(int i=0;i<this.array.length;i++)
			array[i]=(int) (Math.random()*50+10);
	}
	
	
	
	void quickSort(int left, int right){
		++iterations;
		++recursionCount;
		int pivot;
		if(left>=right){
			return;
		}
		else{
			pivot=right;
			int pivotLocation=partition(left,right,pivot);
			quickSort(left, pivotLocation-1);
			quickSort(pivotLocation+1,right);
		}
	}
	
	
	int partition(int left, int right, int pivot){
		int leftPointer=left-1;
		int rightPointer=right;
		//System.out.println(array[left]+" "+array[right-1]+" "+array[pivot]);
		
		while(true){
			++loopCount;
			while(leftPointer<pivot && array[++leftPointer]<=array[pivot] );
			
			while(rightPointer>0 && array[--rightPointer]>array[pivot]);
				
			if(leftPointer>=rightPointer)
				break;
			
			//System.out.println("swap "+array[leftPointer]+" "+array[rightPointer]);
			swap(leftPointer, rightPointer);
			
			//System.out.println(Arrays.toString(array));
		}
		
		//System.out.println(Arrays.toString(array));
		//System.out.println("swap "+array[leftPointer]+" "+array[pivot]);
		swap(leftPointer,pivot);
		//System.out.println(Arrays.toString(array));

		
		return leftPointer;
	}
	void swap(int i1,int i2){
		++swapCount;
		int temp=array[i1];
		array[i1]=array[i2];
		array[i2]=temp;
	}

}
