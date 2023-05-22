package Array;

public class Array2D_multiplication {

	public static void main(String[] args) {
         int i,j,n=2,k;
         int a[][]= {{2,3},{5,6}};
         int b[][]= {{5,1},{2,9}};
	     int c[][]=new int[n][n];
	     for(i=0;i<n;i++)
         {
        	 for(j=0;j<n;j++)
        	 {
        		 System.out.print(a[i][j]+" ");
        	 }
        	 System.out.println();
         }
	     for(i=0;i<n;i++)
         {
        	 for(j=0;j<n;j++)
        	 {
        		 System.out.print(b[i][j] +" ");
        	 }
        	 System.out.println();
         }
         for(i=0;i<n;i++)
         {
        	 for(j=0;j<n;j++)
        	 {
        		 for(k=0;k<n;k++)
        		 {
        			c[i][j]= c[i][j] + a[i][k] * b[k][j];
        		 }
        		 System.out.print( " "+ c[i][j]);
        	 }
        	 System.out.println();
         }

	}

}
