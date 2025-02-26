package demos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SortHashMapbyValue {
	
	
	private static Map<String, Integer> sortedHmap(Map<String, Integer> marks) {
		List<Map.Entry<String, Integer>> entryList = new ArrayList<>(marks.entrySet()); //converting hashmap into list
		
		entryList.sort((entry1, entry2) -> entry1.getValue().compareTo(entry2.getValue())); //using custom comparator 
		
		Map<String, Integer> sortedMarksMap = new LinkedHashMap<String, Integer>(); //creating the linked hashmap to maintain insertion order
		for(Map.Entry<String, Integer> entry: entryList) {
			sortedMarksMap.put(entry.getKey(), entry.getValue());
		}
		return  sortedMarksMap;
	}

	public static void main(String[] args) {
		
		//creating marks hashmap
		Map<String, Integer> marks = new HashMap();
		
		marks.put("English", 95);
		marks.put("Physics", 88);
		marks.put("Chemistry", 99);
		marks.put("Maths", 94);
		marks.put("Computer Science", 97);
		
		System.out.println("Sorted by marks: " + sortedHmap(marks)); //calling the user defined method for sorting 

	}

	

}
