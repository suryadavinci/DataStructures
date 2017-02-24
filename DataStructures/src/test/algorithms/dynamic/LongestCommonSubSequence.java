package test.algorithms.dynamic;

public class LongestCommonSubSequence {

	int maxLen=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new LongestCommonSubSequence().getLCS("ABCBDAB", "BDCABA", "");

	}
	
	
	public void getLCS(String s1,String s2,String com){
		
		if(s1.length()==0 || s2.length()==0){
			if(com.length()>=this.maxLen)
			{
				this.maxLen=com.length();
				System.out.println(com);
			}
			
			return;
		}
		else{
			//System.out.println(s1+" "+s2+" "+com);
			if(s1.charAt(0)==s2.charAt(0)){
				com=com+s1.charAt(0);
				getLCS(s1.substring(1),s2.substring(1),com);
			}
			else{
			getLCS(s1.substring(1),s2,com);
			getLCS(s1,s2.substring(1),com);
			}
			
		}
		
	}


}
