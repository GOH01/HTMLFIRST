package p0703;
import java.util.Scanner;
public class Math {
	public static void main(String[] args) {
		
		int n;
		int hour;
		int min=60;
		int sec=60;
		
		System.out.print("정수입력:");
		Scanner scan= new Scanner(System.in);
		
		n=scan.nextInt();
		
		sec=n%60;
		min=(n/60)%60;
		hour=(n/60)/60;
		
		System.out.print(n+"초는");
		System.out.print(hour+"시간,");
		System.out.print(min+"분,");
		System.out.print(sec+"초");
		
		scan.close();
		
	}

}
