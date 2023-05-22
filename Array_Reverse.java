package Array;

import java.util.Scanner;

public class Array_Reverse {

	public static void main(String[] args) {
		System.out.println("enter the limit:");
   Scanner sc=new Scanner(System.in);
   int n= sc.nextInt();
   System.out.println("Enter the elements:");
   int b[]=new int[n];
  
   int i;
   
  

   for(i=0;i<n;i++)
   {
	   b[i]=sc.nextInt();
	   
	   
   }
   System.out.println("Reverse array:");

   
   for(i=b.length-1;i>=0;i--)
   {
	   System.out.print( " " + b[i]);

   }
   
	}

}
