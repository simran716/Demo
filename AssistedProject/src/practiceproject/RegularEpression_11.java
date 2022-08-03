package practiceproject;

import java.util.regex.Pattern;

public class RegularEpression_11 {
	 public static void main(String args[]) 
	    {  
	        System.out.println (Pattern.matches("python*basic", "pythonbasic")); 
	        System.out.println (Pattern.matches("p*python*", "python")); 
	        
	        
	        //------------------------------------PATTERN SEARCHING------------------------------------//
	        System.out.println(Pattern.matches(".s", "as"));  
	        System.out.println(Pattern.matches("[amn]", "a"));
	        
	        
	        //------------------------------------QUANTIFIER------------------------------------------//
	        System.out.println("? quantifier ....");  
	        System.out.println(Pattern.matches("[amn]?", "a")); 
	        System.out.println(Pattern.matches("[amn]?", "aaa"));
	        
	        System.out.println("+ quantifier ....");  
	        System.out.println(Pattern.matches("[amn]+", "a")); 
	        System.out.println(Pattern.matches("[amn]+", "aaa")); 
	        
	        System.out.println("* quantifier ....");  
	        System.out.println(Pattern.matches("[amn]*", "ammmna")); 
	         
	               
	        //------------------------------------META-CHARACTER------------------------------------------// 
	        System.out.println(Pattern.matches("\\d", "abc"));  
	        System.out.println(Pattern.matches("\\d", "1"));
	        System.out.println(Pattern.matches("\\d", "4443"));  
	        System.out.println(Pattern.matches("\\d", "323abc")); 
	          
	        System.out.println("metacharacters D....");  //D means non-digit  
	          
	        System.out.println(Pattern.matches("\\D", "abc"));   
	        System.out.println(Pattern.matches("\\D", "323abc"));
	        System.out.println(Pattern.matches("\\D", "m")); 
	          
	        System.out.println("metacharacters D with quantifier....");  
	        System.out.println(Pattern.matches("\\D*", "mak"));  
	        
	        System.out.println(Pattern.matches("[A-Z]+\\d{3}[a-zA-Z]*", "S564teutidkghdjdkg"));
	        
	   } 

}
