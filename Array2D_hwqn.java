package Array;

import java.util.Scanner;

public class Array2D_hwqn {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the rows:");
     int m=sc.nextInt();
     System.out.println("enter the columns:");
     int n=sc.nextInt();
     int a[][]=new int[m][n];
     
     System.out.println("enter the  array elements:");
     int i,j;
     for( i=0;i<m;i++)
     {
    	 for(j=0;j<n;j++)
    	 {
    		 a[i][j]=sc.nextInt();
    	 }
    	 
     }
     System.out.println("the metrix");

     
     for( i=0;i<m;i++)
     {
    	 for( j=0;j<n;j++)
    	 {
    		 System.out.print(a[i][j] + " ");
    	 }
    	 System.out.println("");
     }
     
	 System.out.print("Requierd metrix:" + "\n");

     for( i=0;i<m;i++)
     {
    	 for( j=0;j<n;j++)
    	 {
    		 if(i<j)
    		 {
        		 System.out.print(a[i][j] + " ");

    		 }
    		 else
    		 {
    			 System.out.print( " "); 
    		 }
    		 
    	 }
    	 System.out.println();
    		
    	 }
     
     System.out.print("Requierd metrix:" + "\n");

     for( i=0;i<m;i++)
     {
    	 for( j=0;j<n;j++)
    	 {
    		 if(i>j)
    		 {
        		 System.out.print(a[i][j] + " ");

    		 }
    		 else
    		 {
    			 System.out.print( " "); 
    		 }
    		 
    	 }
    	 System.out.println();
    		
    	 }
    	
     
	}

}
