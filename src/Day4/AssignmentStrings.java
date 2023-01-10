package Day4;

public class AssignmentStrings {

	public static void main(String[] args) {
	
 String s= "Thankyou"; //compare two strings
 
 System.out.println(s.equals("Thankyou"));
 System.out.println(s.equalsIgnoreCase("thankyou"));
 
 String s1= " very much"; //concatenate a given String to the end of another string
 
 System.out.println(s.concat(s1));
   System.out.println(s.length()); //length of a given string
   
  System.out.println(s.substring(0,5));//substring between two specified position
  
    s="THANKYOU";
    
    System.out.println(s.toUpperCase());
    System.out.println(s.toLowerCase());
	}

}
