package practiceproject;

import java.util.HashMap;

public class Map_06 {
public static void main(String a[]){
		
    	HashMap hm = new HashMap();
		
    	hm.put("1","1");
        hm.put("2","SECOND");
        hm.put("3","THIRD");
		hm.put("4",null);
		hm.put(1, 23);
		hm.put(null,"FIFTH");
		hm.put(6,"HELLO");
		
        System.out.println("Hashmap is "+ hm);
        System.out.println("Value of 6 key: "+ hm.get("3"));
        System.out.println("Is HashMap empty? "+hm.isEmpty());
        
        hm.remove("4");
        System.out.println("After removal process, the hashmap is "+hm);
        System.out.println("Size of the HashMap: "+hm.size());
        
        System.out.println(hm.containsValue("THIRD"));
        
    }

}
