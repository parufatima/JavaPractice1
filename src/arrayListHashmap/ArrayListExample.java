package arrayListHashmap;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList <String> list=new ArrayList<String>();
		

		list.add("Amreen");
		list.add("Arfaana");
		list.add("Safwan");
		list.add("Nuri");
		list.add("Noman");
		list.add("Nayeem");
System.out.println(list.size()); // returns number of elements in array list

   for(String s:list)
   {
	   System.out.println(s);// reading elements from array list
	   
   }
	}

}
