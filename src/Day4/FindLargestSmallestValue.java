package Day4;

public class FindLargestSmallestValue {

	public static void main(String[] args) {
		int a[]= {20,40,50,80,90,200,390};
		
		int  largest,smallest;
		largest = a[0];//Assigning first element of an array .
		smallest =a[0]; //Assigning first element of an array .
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>largest)
			{
				largest=a[i];
			}
			else if(a[i]<smallest)
			{
				smallest=a[i];
			}
		}
		System.out.println("largest element in an array is ="+largest);
		System.out.println("smallest element in an array is ="+smallest);
		
	
	}

}
