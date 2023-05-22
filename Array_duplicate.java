package Array;

import java.util.Scanner;

public class Array_duplicate {

	public static void main(String[] args) {
		System.out.println("Enter the limit: ");
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		
		 int b[]=new int[n];
		 int j;
			System.out.println("Enter the elements: ");
			
		    for(int i=0;i<b.length;i++)
		    {
		    	b[i]=sc.nextInt();
			     

		    }
		    System.out.println("duplicate elements are:");
		    
		    for(int i=0;i<b.length ;i++)
		    {
			 for( j=i+1;j<b.length;j++)
			 {
				 if(b[i]==b[j])
				 {
					 System.out.println(b[j]);
				 }
			 }

		    	
			
		    
            }
}
}
	


