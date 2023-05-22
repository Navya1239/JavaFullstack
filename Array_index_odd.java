package Array;

public class Array_index_odd {

	public static void main(String[] args) {
		 int b[]=new int[3];
		    b[0]=33; //b[2]={10,20,30}
		    b[1]=20;
		    b[2]=45;
		   
		    for(int i=0;i<b.length;i++)
		    {
		    	if(i%2!=0)
		    	{
			    	System.out.println("The odd index values are: " + b[i]);
	
		    	
		    	}
		    }
	

	}

}
