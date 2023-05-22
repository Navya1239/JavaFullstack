package Array;

import java.util.Scanner;

public class Array_swap_ele {

	public static void main(String[] args) {
		System.out.println("Enter the limit: ");

	    Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
		System.out.println("Enter the elements: ");
		  int c[] = new int[n];
		  
		    
	    for(int i=0;i<n;i++)
	    {   	
	    	c[i]=sc.nextInt();
	    	
	    }
	    System.out.println("The elements are: ");
	    for(int i=0;i<n;i++)
	    {   	
	    	
	  	  System.out.println(c[i]);
	    }
	   
	    System.out.println("The  Swapped elements are: ");
	  
	  
	    for(int i=0;i<n-1;i++)
	    {
	       int temp=c[i];
	       c[i]=c[i+1];
	       c[i+1]=temp;
	       System.out.println(c[i+1]);
	       System.out.println();
	       System.out.println(c[i]);
	    }
	}

}
