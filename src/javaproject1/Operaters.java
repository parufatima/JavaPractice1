package javaproject1;

public class Operaters {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		
		//Arithmetical operaters --> + - * / %
		System.out.println("----------Arithmetical operators ----");
		System.out.println("Sum of a and b is:"+(a+b));
		System.out.println("Diff of a and b is:"+(b-a));
		System.out.println("Mul of a and b is:"+(a*b));
		System.out.println("Div of a and b is:"+(a/b));
		System.out.println("Mod Div of a and b is:"+(a%b));
			
        //Relation Operators (Comparison operators)--> == <> <= >= !=
		//Always return boolean value 
		System.out.println("----------Relational operators ----");
		System.out.println(a==b); //false
		System.out.println(a>b); //false
		System.out.println(a<b); //true
		System.out.println(a>=b); //false
		System.out.println(a<=b); //true
		System.out.println(a!=b); //true
		
		//Logical operators &&  ||  !
		//works between two boolean
		
		boolean x=true;
		boolean y=false;
		System.out.println("----------Logical operators ----");
		System.out.println(x&&y); //false
		System.out.println(x||y); //true
		System.out.println(!x); //false
		System.out.println(!y); //true

        //increment/decrement operators  ++  --
		
		a=10;
		a++;  //a=a+1
		System.out.println(a);
		
		b=20;
		b--;   //b=b-1;
		System.out.println(b);
		

		
	}

}
