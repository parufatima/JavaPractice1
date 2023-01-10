package Day4;

public class SumValueOfArray {

	public static void main(String[] args) {
		
		/*int a[] = new int[8];
		a[0]= 1; 
		a[1]= 2;
		a[2]= 3;
		a[3]= 4;
		a[4]= 5;
		a[5]= 6;
		a[6]= 7;
		a[7]= 8;*/
		
		//Sum of these number
		int a[]= {1,2,3,4,5,6,7,8,};
		
		int sum =0;
	
		for(int i=0;i<=a.length-1;i++)
		{
			//System.out.println(a[i]);
			sum = sum + a[i];
		
		}
			System.out.println(sum);
		
		
   System.out.println("4th row numb:"+a[3]); //Find specific number of an array
	}

}
