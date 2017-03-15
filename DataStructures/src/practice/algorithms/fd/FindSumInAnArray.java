package practice.algorithms.fd;

import java.util.Arrays;

import sources.AllUtils;

public class FindSumInAnArray {

	public static void main(String[] args) {
		int[] x = AllUtils.generateRandomIntArray(1000,1,100);
		int eSum=65;
		System.out.println(Arrays.toString(x));
		Arrays.sort(x);
		System.out.println(Arrays.toString(x));
		int lp=0;
		int rp=x.length-1;
		int curr=0;
		while(lp<=rp){
			curr = x[lp]+x[rp];
			if(curr == eSum)
				{
					System.out.println(x[lp]+" "+x[rp]);
					lp++;
					rp--;
				}
			else if(curr < eSum){
				lp++;
			}
			else if(curr > eSum){
				rp--;
			}
		}

		
	}

}
