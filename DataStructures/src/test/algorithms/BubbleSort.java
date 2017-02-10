package test.algorithms;


import java.util.Arrays;

import sources.AllUtils;

public class BubbleSort {

	private int array[];
	private int arraySize;
	private long iterCount;

	public static void main(String[] args) {
		BubbleSort bs= new BubbleSort(10);
		bs.printArray();
		bs.bubble();
		bs.printArray();
	}
	
	public long getIterCount()
	{
		return this.iterCount;
	}
	
	BubbleSort(int size){
		this.array=AllUtils.generateRandomArray(size);
		this.arraySize=size;
	}
	
	BubbleSort(int[] sortThisArray){
		this.array= sortThisArray;
		this.arraySize=array.length;
	}
	
	public void bubble()
	{
		int temp=0;
		for(int i=0;i<array.length;i++){
			for(int j=i+i;j<array.length;j++){
				this.iterCount++;
				if(array[i]>array[j]){
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
				
			}
		}
	}
	
	public void printArray(){
		System.out.println(Arrays.toString(array));
	}
	
	
	
}
