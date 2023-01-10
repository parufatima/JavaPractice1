

package arrayListHashmap;


import java.util.ArrayList;

public class ArrazListExample2 {

	public static void main(String[] args) {
		
		ArrayList al= new ArrayList();
		//adding elements to array list
		System.out.println("Number of elements" + al.size());
		         //number of elements present
		al.add("welcome");
		al.add(10);
		al.add(20.50);
		al.add('c');

		System.out.println("Number of elements in array after adding are :" + al.size());//number of elements present
		//inserting elements into array list
		
		System.out.println("Elements in array list :" +al);
		//inserting elements into array list
		
		al.add(2,"my home");
		al.add(1,2345);
		System.out.println("Number of elements in array after inserting are :" + al.size());
		System.out.println("Elements in array list :" +al);
	}

}
