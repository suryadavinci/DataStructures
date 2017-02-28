package test.datastructures.applications;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Scanner;

public class WordFrequency {
	
	public static void main(String[] args) {
		File file = new File("book");
		HashMap<String,Integer> map= new HashMap<String,Integer>();
		
		try {

			Scanner s= new Scanner(file);
			String current;
			int frequency;
			while(s.hasNext()){
				current=s.next();
				if(map.containsKey(current))
					frequency=map.get(current);
				else
					frequency=0;
				
				map.put(current, frequency+1);
				
				
			}
			System.out.println(map.get("The"));

			System.out.println(map.get("The")+map.get("the"));
			
			System.out.println(map);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}
}
