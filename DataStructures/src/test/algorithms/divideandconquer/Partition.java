package test.algorithms.divideandconquer;

import sources.AllUtils;

public class Partition {
	public static void main(String[] args) {
		int[] x = AllUtils.generateRandomIntArray(8, 1, 100);
		partition(x);
	}
	
	private static void partition(int[] x) {
		partition(x,0,x.length-1);
	}

	public static void partition(int[] x,int left, int right){
		if(left>=right){
			return;
		}
		int mid=(right-left)/2+left;
		partition(x,left,mid);
		partition(x,mid+1,right);
		System.out.println(left+" "+right);
	}
	
	public static void merge(int[] x, int left, int right){

		int mid=(right-left)/2+left;
	}
}
