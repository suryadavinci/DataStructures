package sources;

public class MyQuickSort {

	
	int[] array;
	int arraySize;
	
	int totalIterations=0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyQuickSort mqs=new MyQuickSort(10);
		
		mqs.quickSort(0, mqs.array.length-1);


		mqs.displayArray();
		/*
		  mqs.array[0]=58;
		  mqs.array[1]=86;
		  mqs.array[2]=88;
		  mqs.array[3]=50;
		  mqs.array[4]=50;
		  mqs.array[5]=38;
		  mqs.array[6]=29;
		  mqs.array[7]=57;
		  mqs.array[8]=45;
		  mqs.array[9]=19;
		  */
		  //mqs.quickSort(0, 9);
		  
		  //mqs.displayArray();
	}

	
	
	
	public void quickSort(int left, int right)
	{
		totalIterations++;
		
		if(right-left<=0)
		{
			return;
		}
		else
		{
			int pivot=array[right];
			
			System.out.println("Pivot value "+pivot+" pivotLocation "+right);
			
			int pivotLocation=partition(left,right,pivot);
			System.out.println("Pivot Location "+ pivotLocation);
			
			quickSort(left,pivotLocation-1);
			quickSort(pivotLocation+1,right);
			
		}
		
		
	}
	
	
	void displayPointers(int leftPointer, int rightPointer)
	{
		
		for(int i=0;i<=rightPointer;i++)
		{
			if(i!=leftPointer && i!=rightPointer)
				System.out.print("       ");
			if(i==leftPointer)
				System.out.print(" LP"+leftPointer+"   ");
			if(i==rightPointer)
				System.out.print(" RP"+rightPointer+"   ");
				
		}
		System.out.println();
		
	}
	
	
	public int partition(int left, int right, int pivot)
	{
		int leftPointer=left-1;
		int rightPointer=right;
		while(true)
		{
			
			while(array[++leftPointer]<pivot)
				;
			
			while(rightPointer>0 && array[--rightPointer]>pivot)
				;
			
			if(leftPointer>=rightPointer)
				break;
			else
			{
				displayArray();
				displayPointers(leftPointer,rightPointer);
				swapValues(leftPointer,rightPointer);
				
				System.out.println("After swapping "+leftPointer+" "+rightPointer+" inside loop");
				
				
				
			}
			
			
		}
		
		displayArray();
		displayPointers(leftPointer,right);
		swapValues(leftPointer,right);
		
		System.out.println("After swapping outside loop");
		displayArray();
		
		
		return leftPointer;
	}
	
	void swapValues(int leftPointer, int rightPointer)
	{
	
		int temp=array[leftPointer];
		array[leftPointer]=array[rightPointer];
		array[rightPointer]=temp;
	}
	
	
	
	MyQuickSort(int size)
	{
		this.arraySize=size;
		array=new int[size];
		generateRandomArray();
		displayArray();
		
		
	}
	
	
	void generateRandomArray()
	{
		for(int i=0;i<this.arraySize;i++)
		{
			array[i]=(int)   Math.round(Math.random()*50+10);
		}
	}
	
	
	void displayArray()
	{
		for(int i=0;i<this.array.length*7;i++)
		{
			System.out.print("-");
		}
		System.out.println();
		for(int i=0;i<this.array.length;i++)
		{
			System.out.print("  "+array[i]+"  |");
		}
		System.out.println();
		for(int i=0;i<this.array.length*7;i++)
		{
			System.out.print("-");
		}
		System.out.println();
		
		
	}
	
}
