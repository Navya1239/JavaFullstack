package Array;

public class Linear_search {

	public static void main(String[] args) {
		int a[]= {10,20,30,50,60,58,50};
		int key=50;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==key)
		
		{
			System.out.println(key + " " + " is found at index: " + i);
		}
		}
	}

}
