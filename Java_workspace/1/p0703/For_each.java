package p0703;

public class For_each {

	public static void main(String[] args) {
		int[] n= {1, 2, 3, 4, 5};
		String[] s= {"사과","배","바나나","체리","딸기","포도"};
		int i;
		int sum=0;
		
		for(int k:n)
		{
			System.out.print(k+" ");
			sum+=k;
		}
		System.out.println("합은"+sum);
		
		for(String f:s)
		{
			System.out.print(f+" ");
		}
		

	}

}
