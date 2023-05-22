package Array;

import java.util.Scanner;

public class Array2D_userinput1 {

	public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the no of rows of 1st metrix:");
       int m=sc.nextInt();
       System.out.println("Enter the no of columns of 1st metrix:");
       int n=sc.nextInt();
       System.out.println("Enter the no of rows of 2nd metrix:");
       int p=sc.nextInt();
       System.out.println("Enter the no of columns of 2nd metrix:");
       int q=sc.nextInt();
       int a[][]=new int[m][n];
       int b[][]=new int[p][q];
       
       int i,j;
       
       
       //FIRST METRIX
       System.out.println("Enter the elements  of 1st metrix:");
       for(i=0;i<m;i++)
       {
    	   for(j=0;j<n;j++)
    	   {
    		  a[i][j]=sc.nextInt();    //FOR READING ELEMENTS
    	   }
       }
       System.out.println(" 1st metrix:");
       for(i=0;i<m;i++)
       {
    	   for(j=0;j<n;j++)
    	   {
    	       System.out.print(" " + a[i][j] + " ");   //FOR PRINTING ELEMENTS

    	   }
           System.out.println();

       }
       
       //second metrix
       System.out.println("Enter the elements  of 2nd metrix:");
       for(i=0;i<p;i++)
       {
    	   for(j=0;j<q;j++)
    	   {
    		  b[i][j]=sc.nextInt(); 
    	   }
       }
       
       
       System.out.println(" 2nd metrix:");
       for(i=0;i<p;i++)
       {
    	   for(j=0;j<q;j++)
    	   {
    	       System.out.print(" " + b[i][j] + " ");

    	   }
           System.out.println();

       }
       

	}

}
