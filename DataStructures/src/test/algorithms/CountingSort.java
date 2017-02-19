package test.algorithms;

import java.util.Arrays;

import sources.AllUtils;

public class CountingSort {
	int[] array;
	int[] outputArray;
	public static void main(String[] arg){
		
		CountingSort cSort= new CountingSort(100);
		
	}
	
	CountingSort(){
		//this.array=new int[]{1,4,1,2,7,5,2};
	}
	CountingSort(int size){
		this();
		if(this.array==null){
			array=AllUtils.generateRandomIntArray(size, 1, size);
		}
		outputArray=new int[this.array.length];
		System.out.println(Arrays.toString(array));
		sort();
		System.out.println(Arrays.toString(outputArray));
	}
	
	
	public void sort(){
		
		int[] cArray=new int[this.array.length+5];
		
		for(int i=0;i<this.array.length;i++){
			cArray[this.array[i]]=(cArray[this.array[i]])+1;
		}
		
		System.out.println(Arrays.toString(cArray));
		
		int k=0;
		
		/*for(int i=1;i<cArray.length;i++){
			cArray[i]=cArray[i]+cArray[i-1];
		}
		
		System.out.println(Arrays.toString(cArray));
/*
		
		for(int i=0;i<cArray[cArray.length-1];i++){
			if(cArray[array[i]]>0){
			outputArray[array[i]]=cArray[array[i]];
			cArray[array[i]]=cArray[array[i]]-1;
			}
		}
		System.out.println(Arrays.toString(cArray));
*/
		
		for(int i=0;i<cArray.length;i++){
			
			for(int j=0;j<cArray[i];j++){
				this.outputArray[k++]=i;
			}
		}
	}
	
}
