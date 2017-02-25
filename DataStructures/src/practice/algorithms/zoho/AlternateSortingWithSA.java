package practice.algorithms.zoho;

import java.util.Arrays;

public class AlternateSortingWithSA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array={1,2,3,4,5,6,7};
		int[] out=new int[array.length];
		int j=0,l=array.length,lp=0,rp=l-1;
		for(int i=0;i<l/2;i++){
			lp=i;
			rp=l-1-i;
			
			out[j++]=array[lp];
			out[j++]=array[rp];
			
		}
		out[l-1]=array[l/2];
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(out));
		
	}

}
