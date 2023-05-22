package Array;

import java.util.Scanner;

public class Array_1 {

	public static void main(String[] args) {
    int b[]=new int[3];
    b[0]=10;
    b[1]=20;
    b[2]=30;
    for(int i=0;i<b.length;i++)
    {
    	System.out.println(b[i]);
    }
    
    int a[]= {10,20,30,50,60,70};
    for(int i=0;i<a.length;i++)
    {
    System.out.println(a[i]);
    }
    
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
  
    for(int i=0;i<n;i++)
    {
       int temp=c[i];
       c[i]=c[i+1];
       c[i+1]=temp;
       System.out.println(c[i] +" "+ c[i+1]);
    }
    
    
 
	}

}
