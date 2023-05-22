package Array;

import java.util.Scanner;

public class Array_swapp {
	public static void main(String[] args) {
    System.out.println("Enter the limit:");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[]=new int[n];
	int b[]=new int[n];
	System.out.println("Enter array1 elements : ");
      for(int i=0;i<n;i++)
      {
    	 a[i]=sc.nextInt(); 
    	
      }
      System.out.println("\n" + "Enter array2 elements : ");
      for(int i=0;i<n;i++)
      {
    	 b[i]=sc.nextInt(); 
    	
      }
      System.out.println("the array1 elements are: " + "\n" );
      for(int i=0;i<n;i++)
      {
    	  System.out.print(a[i] + " " );

      }
      
      
    System.out.println( "\n the array2 elements are: " + "\n" );
    for(int i=0;i<n;i++)
    {
    	System.out.print(b[i] + " ");  	
    }
    
    
    for(int i=0;i<n;i++)
    {
    	int temp=a[i];
    	a[i]=b[i];
    	b[i]=temp;
    	
    }
    System.out.println( "\n"+"the swapped array1 :"+ "\n");
	
    for(int i=0;i<n;i++)
    {
    	System.out.print( a[i]+ " " );
    	
    }
  System.out.println("\n " + "the swapped array2 :"+ "\n");
	
    for(int i=0;i<n;i++)
    {
    	System.out.print( b[i] + " ");
    	
    }
    
}
	
}
