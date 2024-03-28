package p0703;
import java.util.Scanner;
public class Continue {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int i;
		int n;
		int sum=0;
		
		System.out.print("5개의 정수 입력:");
		for(i=0; i<5; i++)
		{
			n=scan.nextInt();
			if(n<0)
			{
				continue;
			}
			else
			{
				sum+=n;
			}
			
		}
		System.out.print("양수의 합은"+sum);
        scan.close();
	}

}
