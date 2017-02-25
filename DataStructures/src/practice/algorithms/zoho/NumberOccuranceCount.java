package practice.algorithms.zoho;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class NumberOccuranceCount {

	public static void main(String[] args) {
		int[] a = { 2, 3, 2, 6, 1, 6, 2 };

		HashMap<Integer, Integer> numberCount = new HashMap<Integer, Integer>();

		Integer oldValue = 0;

		numberCount.get(0);

		for (int i = 0; i < a.length; i++) {

			oldValue = numberCount.get(a[i]);

			numberCount.put(a[i], oldValue != null ? oldValue + 1 : 1);
		}

		Iterator<Entry<Integer, Integer>> i = numberCount.entrySet().iterator();

		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
