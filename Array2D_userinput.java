package Array;

import java.util.Scanner;

public class Array2D_userinput {

	public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
     
     
      System.out.println("Enter the 2d array limit:");
      int n=sc.nextInt();
      int m=sc.nextInt();
      int a[][]=new int[m][n];
      System.out.println("Enter the array elements:");
      
      int i,j;
      for(i=0;i<m;i++)
      {
    	  for( j=0;j<n;j++)
    	  {
    		  a[i][j]=sc.nextInt();
    		  
    	  }
      }
     
      System.out.println("The 2D metrix:");

      
    	  for(i=0;i<m;i++)
          {
        	  for( j=0;j<n;j++)
        	  {
        		  System.out.print(a[i][j] + " ");        		  
        	  }
    	  
         
        	  System.out.println("");
          }
      


	}

}
