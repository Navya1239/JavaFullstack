package Array;

public class Array2D_addition {

	public static void main(String[] args) {
	     int a[][]= {{10,20,30},{50,30,70},{12,33,55}};
	     int b[][]= {{12,20,40},{10,30,10},{8,36,5}};
	     int i,j;
	     System.out.print("First metrix: " +"\n");
	     

	     for( i=0;i<3;i++)
         {
             for( j=0;j<3;j++)
             {
	     System.out.print( a[i][j] + " " );
	    

             }
             System.out.println();
         }
             
             System.out.print("Second metrix: " +"\n");
    	     

    	     for( i=0;i<3;i++)
             {
                 for( j=0;j<3;j++)
                 {
    	     System.out.print( b[i][j] + " " );
    	    

                 }
                 System.out.println();
         }
	     int c[][]=new int[3][3];
	     
	     System.out.print("The sum of 2D metrix:" + "\n");

         for( i=0;i<3;i++)
         {
             for( j=0;j<3;j++)
             {
            	 

        	 c[i][j]=a[i][j] + b[i][j];
        	 System.out.print(c[i][j] + " ");
             }
             
             System.out.println();
         }
	
	}

}
