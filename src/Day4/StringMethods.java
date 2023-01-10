package Day4;

public class StringMethods {

	public static void main(String[] args) {
	
		String s="Welcome";
		String s1=" to java";
		
		System.out.println(s.length()); //length of a string
		System.out.println(s.concat(s1)); //joining of string
		
		s="     Welcome    ";
		
		System.out.println("Before trimming is :" +s);
	System.out.println("After trimming is :" +s.trim());

	//carAt()
	s="Welcom";
	System.out.println(s.charAt(5)); //returns character based on index number, index will start from 0
	
	//contains()
	
	s="Welcom";
	
    System.out.println(s.contains("Wel"));
    System.out.println(s.contains("wel"));
    System.out.println(s.contains("com"));
    
    //comparing strings equals()
    
    s="Welcome";
    System.out.println(s.equals("Welcome")); //True
    System.out.println(s.equals("Wel  come")); //false
    System.out.println(s.equals("welcome"));  //false
    
    System.out.println(s.equalsIgnoreCase("welcome"));
    
    //replacing characters 
    
    s= "Welcome to Java";
     System.out.println(s.replace('o','i')); //Welcime ti Java
     System.out.println(s.replace("Java","Selenium")); //Welcome to Selenium
     
     //extracting substring from the main string 
     s="Welcome";
     
    System.out.println(s.substring(0,4)); //Welc
    
    //converting case 
    
    s="WELCOME";
   System.out.println(s.toLowerCase());
   
   s="welcome";
   
  System.out.println(s.toUpperCase());
   
     
	
	}

}
