package p.Part2;
import java.lang.Math;
import java.util.*;

public class CircleEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("원의 반지름을 정수로 입력하세요: ");
		int r=scan.nextInt();
		double pi=3.14159;
		
	System.out.println("원의 반지름:"+r);
	System.out.println("원의 둘레: "+(2*Math.PI+r));
		
		
	}

}
