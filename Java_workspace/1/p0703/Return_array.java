package p0703;

public class Return_array {
	static int[] makeArray()
	  {
		  int temp[]= {0,1,2,3};
		  return temp;
	  }
	public static void main(String[] args) {
	  int welcome[]=makeArray();
	  
	  for(int i=0; i<welcome.length; i++)
	  {
		  System.out.print(welcome[i]+" ");
	  }
	}

}
