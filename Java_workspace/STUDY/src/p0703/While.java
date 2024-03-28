package p0703;
import java.util.Scanner;
public class While {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n;
		int t=0;
		int sum=0;
		double avg;
		
		System.out.print("정수 마지막에 0을 입력:");
		while(true)
		{
			n=scan.nextInt();
			sum+=n;
			t++;
			if(n==0)
			{
				break;
			}
		}
		t--;
		avg=sum/t;
		System.out.print("수의 개수는"+t+"개 평균"+avg);
		
		scan.close();

	}

}
