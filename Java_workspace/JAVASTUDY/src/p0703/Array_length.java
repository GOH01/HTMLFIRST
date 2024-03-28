package p0703;
import java.util.Scanner;
public class Array_length {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int n[]=new int[5];
		int i;
		int sum=0;
		double avg;
		
		System.out.print("5개의 정수 입력");
		for(i=0; i<n.length; i++)
		{
			n[i]=scan.nextInt();
			sum+=n[i];
		}
		avg=(double)sum/(double)n.length;
		
		System.out.print("평균"+avg);
		
		scan.close();

	}

}
