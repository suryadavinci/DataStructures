package test.algorithms;

import java.util.ArrayList;
import java.util.Arrays;

import sources.AllUtils;

public class BucketSort {
	
	float[] array;
	int buckets;
	
	ArrayList<Float>[] bucketList;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BucketSort(100);
	}
	
	@SuppressWarnings("unchecked")
	BucketSort(int size){
		this.array=AllUtils.generateRandomFloatArray(size);
		System.out.println(Arrays.toString(this.array));
		this.buckets=size;
		this.bucketList= new ArrayList[this.buckets];
		sort();
	}
	
	private void sort(){
		
		for( float x:array){
			pushToBucket(x);
		}
		
		insertionSort();
		
		for(int i=0;i<this.buckets;i++)
		{
			if(this.bucketList[i]!=null)
				System.out.println(this.bucketList[i]);
		}
		
	}
	private void pushToBucket(float value){
		
		int index=(int) (value*this.buckets);
		ArrayList<Float> current;
		
		if(this.bucketList[index]!=null){
			current=this.bucketList[index];
			current.add(value);
		}
		else{
			current= new ArrayList<Float>();
			current.add(value);
			this.bucketList[index]=current;
		}
		
	}
	
	
	private void insertionSort(){

		Float low=0f; int k;
		for(int i=0;i<this.buckets;i++){
			
			if(this.bucketList[i]!=null){
				for(int j=1;j<this.bucketList[i].size();j++){
					low=this.bucketList[i].get(j);
						for( k=j-1;k>0;k--){
								
							if(this.bucketList[i].get(k)>low){
								this.bucketList[i].set(k+1, this.bucketList[i].get(k));
							}
							else
								break;
						}
						this.bucketList[i].set(k+1, low);
				}
			}
			
		}
	}

}
