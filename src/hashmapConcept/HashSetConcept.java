package hashmapConcept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HashSetConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//cannot have duplicate values
		//does not maintain the order
		//no index
		Set<String> browserSet = new HashSet<String> ();
		
		browserSet.add("chrome");
		browserSet.add("Firefox");
		browserSet.add("IE");
		browserSet.add("Safari");
		
		System.out.println(browserSet);
		System.out.println("Set support contains and verifying if browserSet contains Edge: "+ browserSet.contains("Edge"));
		for(String e : browserSet) {
			System.out.println(e);
		}
		System.out.println("-----Using Interator-----");
		Iterator<String> it = browserSet.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("-----Convert a set to a index based list-----");
		List<String> browserList = new ArrayList<String>(browserSet);
		System.out.println(browserList.get(0));

	}

}
