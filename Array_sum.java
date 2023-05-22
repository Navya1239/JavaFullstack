package Array;

public class Array_sum {

	public static void main(String[] args) {
		  int b[]=new int[3];
		    b[0]=10; //b[2]={10,20,30}
		    b[1]=20;
		    b[2]=30;
		   int  sum=0;
		    for(int i=0;i<b.length;i++)
		    {
		    	sum=b[i] +sum;
		    	System.out.println("The values are: " + b[i]);
		    }
	System.out.println("sum:" +sum);
	}

}
