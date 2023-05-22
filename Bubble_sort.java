package Array;

public class Bubble_sort {

	public static void main(String[] args) {
      int a[]= {20,30,10,43,50,11};
      for(int i=0;i<a.length;i++)
      {
    	  for(int j=i+1;j<a.length;j++)
    	  {
    		  if(a[i]>a[j])
    		  {
    			  int temp=a[i];
    			  a[i]=a[j];
    			  a[j]=temp;
    			  
    		  }
    	  }
    	  System.out.println(a[i]);
      }
      System.out.println("largest no in array:");
	  int temp1=a[0];

      for(int i=0;i<a.length;i++)
      {
    		  if(a[i]>temp1)
    		  {
    			   temp1=a[i];
    			  
    			  
    		  }

      }

	        System.out.println(temp1);

      }
}
	
	
	


