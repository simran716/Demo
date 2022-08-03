package practiceproject;
import java.util.*;
public class Collections_05 {
	 public static void main(String[] args){
	//-------------List----------------// 
     List<String> cityNames = new ArrayList<String>();
     cityNames.add("Java");
     cityNames.add("Python");
     cityNames.add("MongoDB");
     cityNames.add("AWS");
     cityNames.add("Oracle");

     // Iterating country names through forEach using Lambda Expression
     cityNames.forEach(name -> System.out.println(name));
     
     
     //-----------Map-----------------//
     Map<String, Integer> ranks = new HashMap<String, Integer>();
     ranks.put("Delhi", 5);
     ranks.put("Mumbai", 4);
     ranks.put("Pune", 2);
     ranks.put("Hyderabad", 1);
     ranks.put("Chandigarh", 3);
     
     // Iterating through      
     ranks.forEach((k,v) -> System.out.println("Team : " + k + ", Rank : " + v));
  }

}
