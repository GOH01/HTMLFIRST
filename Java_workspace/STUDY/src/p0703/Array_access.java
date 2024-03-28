package p0703;
import java.util.Scanner;
public class Array_access {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int n[]=new int[5];
		int i;
		int max=0;
		
		System.out.print("양수 5개 입력:");
		for(i=0; i<5; i++)
		{
			n[i]=scan.nextInt();
			max=max>n[i]?max:n[i];
		}
		
		System.out.print("가장 큰 수"+max);
		scan.close();

	}

}
