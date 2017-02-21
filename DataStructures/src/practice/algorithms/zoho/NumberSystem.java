package practice.algorithms.zoho;

import java.util.Scanner;

public class NumberSystem {
	static String[] mem;
	
	public static void main(String[] args) {
		numberSystem();
	}
	static void numberSystem(){
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		mem= new String[n];
		mem[0]="0";
		mem[1]="1";
		

		for(int i=0;i<n;i++)
			System.out.println(i+" \t"+computeNthNumber(i));
		
	}
	static String computeNthNumber(int n){
		
	//System.out.println(n);
			if(mem[n]==null){

				mem[n]=computeNthNumber(((n-1)/2)-(n%2))+""+n%2;
				return mem[n];
			}
			else
				return mem[n];
		
		
	}
	
}
