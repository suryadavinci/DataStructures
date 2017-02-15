package test.algorithms;

public class Permutation {

	public static void main(String[] args) {
		new Permutation().permutate("", "abcd");
	}
	
	void permutate(String prefix, String s){
		int n=s.length();
		if(n==0)
			System.out.println(prefix);
		else{
			
			for(int i=0;i<n;i++){
				permutate(prefix+s.charAt(i), s.substring(0, i)+s.substring(i+1,n));
			}
		}
		
	}
}
