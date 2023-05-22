package Array;

import java.util.Scanner;

public class Array_index_even {

	public static void main(String[] args) {
     System.out.println("Enter the limit:");
     Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		 int b[]=new int[n];

	     System.out.println("Enter the elements:");
	    


		for(int i=0;i<b.length;i++)
		{
			 b[i]=sc.nextInt();
		}
		 System.out.println("The odd index values are:");
		for(int i=0;i<b.length;i++)
		{
			 if(i%2==0)
			 {
				 System.out.println(b[i]);
			 }
		}
		
		 System.out.println("The even index values are:");

		for(int i=0;i<b.length;i++)
		{
			 if(i%2!=0)
			 {
				 System.out.println(b[i]);
			 }
		}
	}

}
