package sources;

public class AllUtils {

	private int[] array;
	private int size;

	public static void main(String[] args) {
		new AllUtils(10);

	}

	public int[] getArray() {
		return this.array;
	}

	AllUtils(int size) {
		this.size = size;
		this.array = new int[size];
		generateRandomArray();
		// printArray();
	}

	void generateRandomArray() {
		for (int i = 0; i < this.array.length; i++)
			array[i] = (int) Math.round((Math.random() * this.size * 10));
	}
	
	public static int[] generateRandomArray(int size) {
		int[] random= new int[size];
		
		for (int i = 0; i < random.length; i++)
			random[i] = (int) (Math.random() * 50) + 10;
		return random;
	}
	
	public static int[] generateRandomArray(int size, int range){
		
		int[] random= new int[size];
		int i=0;
		 while (i< random.length){
			random[i] = (int) (Math.random() * 10000)/range ;
			
			if(random[i]<=range)
				i++;
			
		}
		return random;
		
		
	}
	

	void printArray() {
		System.out.print("[ ");
		for (int i = 0; i < this.array.length; i++) {
			System.out.print(array[i] + ", ");
		}
		System.out.println("]");

	}

	public static void printArray(int[] array) {
		for (int i = 0; i < array.length * 7; i++) {
			System.out.print("-");
		}
		System.out.println();
		for (int i = 0; i < array.length; i++) {
			System.out.print("  " + array[i] + "  |");
		}
		System.out.println();
		for (int i = 0; i < array.length * 7; i++) {
			System.out.print("-");
		}
		System.out.println();

	}
}
