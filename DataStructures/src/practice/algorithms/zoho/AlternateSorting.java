package practice.algorithms.zoho;

import java.util.Arrays;

public class AlternateSorting {

	static int[] a = { 4, 1, 6, 2, 7, 3, 5 };
	
	public static void main(String[] args) {
		System.out.println("BEFORE: "+Arrays.toString(a));
		alternateSort();
		
	}
	
	static void alternateSort(){


		int high=-1,low=0;
		
	for(int i=0;i<a.length;){
		
		high=i;
		low=i;
		
			for(int j=i;j<a.length;j++){
				//System.out.println("comparing "+a[j]+" "+a[low]+" "+a[high]);
				if(a[j]<a[low]){
					low=j;
				}
				if(a[j]>a[high]){
					high=j;
				}
				
			}
			
			//System.out.println("BEFORE : "+Arrays.toString(a));
			
			
			swap(i,low);
			
			if(i!=high)
				swap(i+1,high);
			i=i+2;

			//System.out.println("AFTER : "+Arrays.toString(a));

	}
			System.out.println("FINAL : "+Arrays.toString(a));
		
	}
	static void swap(int i1, int i2){
		int temp=a[i1];
		a[i1]=a[i2];
		a[i2]=temp;
				
	}

}
