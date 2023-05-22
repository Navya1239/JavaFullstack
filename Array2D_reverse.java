package Array;

import java.util.Scanner;

public class Array2D_reverse {

	public static void main(String[] args) {
		System.out.println("Enter rows of 2D array:");
        Scanner sc=new Scanner(System.in);
        int m= sc.nextInt();
		System.out.println("Enter columns of  2D array:");
        int n= sc.nextInt();
        int a[][]=new int[m][n];
int i,j;
		System.out.println("Enter 2D array elements:");
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				a[i][j]=sc.nextInt();
			}
		
		}
		
	    System.out.println("Orginal metrix:");

		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.print(a[i][j] + " ");
			}
		System.out.println();
		}
		
		
	    System.out.println("Reversed metrix:");
		for(i=0;i<m;i++)
		{
			for(j=n-1;j>=0;j--)
			{
               System.out.print(a[i][j] + " ");
			}
			System.out.println("");
		}
	}

}
