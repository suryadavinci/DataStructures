package sources;

public class AllUtils {
	
	
	private int[] array;
	private int size;
	
	public static void main(String[] args) {
		new AllUtils(10);
		
		

	}
	
	
	AllUtils(int size)
	{
		this.size=size;
		this.array = new int[size];
		generateRandomArray();
		printArray();
	}
	
	
	void generateRandomArray()
	{
		for(int i=0;i<this.array.length;i++)
			array[i]=(int) Math.round((Math.random()*this.size*10));
		}
	
	
	void printArray()
	{
		for(int i=0;i<this.array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
		
	}
}
