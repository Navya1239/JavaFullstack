package Array;

import java.util.Scanner;

public class Array_even_input {

	public static void main(String[] args) {
		System.out.println("Enter the limit: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		 int b[]=new int[n];
			System.out.println("Enter the elements: ");
			
		    for(int i=0;i<b.length;i++)
		    {
		    	b[i]=sc.nextInt();
		    }
		    System.out.println("the odd values are: ");
		    for(int i=0;i<b.length;i++)
		    {
		    	if(b[i]%2!=0)           //print odd values 
		    	{
			    	System.out.println( b[i]);
	
		    	
		    	}
		    }
		    	System.out.println("the even values are: ");
		    	 for(int i=0;i<b.length;i++)
				    {
		    	if(b[i]%2==0)  
		    	{
			    	System.out.println( b[i]);      //print even values 
		    	}
		    }
		    
		    
	

	}

}
