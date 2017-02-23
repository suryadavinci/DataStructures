package practice.algorithms.zoho;

public class StringCombinations {

	static int count=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		permute("", "surya");
	}
	
	
	public static void permute(String prefix, String input){
		int len=input.length();
		if(len==0){
			System.out.println(++count+" "+prefix);
			return;
		}
		
		for(int i=0;i<len;i++){
		
			permute(prefix+""+input.charAt(i),input.substring(0, i)+input.substring(i+1,len));
		}
		
		
	}

}
