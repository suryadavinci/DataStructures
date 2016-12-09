package algorithms;
import java.util.List;
import java.util.LinkedList;


public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x[]={5,1,6,2,3};
		
		LinkedList<Integer> list= new LinkedList<Integer>();
		
		
	
		int listSize=0;
		//System.out.println(list);
		
	//	System.out.println(x.length);
		for(int i=0;i<x.length;i++)
		{
			
			System.out.println(x[i]);
			System.out.println(list);
			
			listSize=list.size();
			for(int j=0;j<listSize;j++)
			{
				//if(list.getLast()<=x[i] )					{list.add(x[i]);					break;					}
				//System.out.println(j+" "+list.size());
				if(list.get(j) > x[i])
					list.add(j, x[i]);
				else if(j==listSize)
					{
					list.add(x[i]);
					break;
					}
				
			}
			if(list.isEmpty() )
				list.add(x[i]);
				
			
				
			
			
		}
		
		
		System.out.println(list);
		

	}

}
