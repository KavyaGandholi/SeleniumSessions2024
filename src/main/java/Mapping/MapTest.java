package Mapping;

import java.util.HashMap;

import org.apache.logging.log4j.util.LambdaUtil;

public class MapTest {

	public static void main(String[] args) {

		//hashmap is a class just like array list
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		//key is Integer, value is String
		map.put(100, "Tom");
		map.put(200, "Ravi");
		map.put(300, "Peter");
		map.put(400, "kAVYA");
		map.put(300, "Aarti");
		map.put(500, null);
		map.put(null, null);
		
		
		System.out.println(map.get(100));
		System.out.println(map.get(400));
		System.out.println(map.get(500));
		System.out.println(map.get(null));
		
		
		System.out.println("-------------");
		
		//hashmap maintains random order 
		HashMap<String, String> empMap = new HashMap<String,String>();
		empMap.put("IBM", "Tom");
		empMap.put("Google", "Peter");
		empMap.put("MS", "Kavya");
		empMap.put("Apple", "Naveen");
		
		System.out.println(empMap.get("IBM"));
		
		//to print all the values from HashMap:
		empMap.forEach((k,v) -> System.out.println(k + ":" + v));
		
	}

}
