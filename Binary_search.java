package Array;

public class Binary_search {

	public static void main(String[] args) {
      int a[]= {20,10,20,30,40,50};
      int key=40;
      int l=a.length-1;
      System.out.println(l);
      int f=0;
      int m=(f+l)/2;
      System.out.println(m);
      while(f<=l)
      {
    	  if(a[m]<key)
    	  {
    		  f=m+1;
    	  }
    	  else if(a[m]==key)
    	  {
    		  System.out.println("element is found at index: " + m);
    		  break;
    	  }
    	  else
    	  {
    		  l=m-1;
    	  }
    	  m=(f+l)/2;
      }
      
      if(f>l) 
      {
    	  System.out.println(" element is not found ");
      }
	}

}
