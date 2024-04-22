package hashmapConcept;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> empMap = new HashMap<String, String>();
		System.out.println(empMap.size());//0
		empMap.put("Peter", "QA");
		empMap.put("abc", "xyz");
		System.out.println(empMap.size());//2
	}

}
