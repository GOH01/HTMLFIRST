package p0703;
import java.util.Scanner;
public class Divide_by_zero {

	public static void main(String[] args) {
	   Scanner scan=new Scanner(System.in);
	   int dividend;
	   int divisor;
	   
	   System.out.print("피젯수 입력");
	   dividend=scan.nextInt();
	   System.out.print("젯수 입력");
	   divisor=scan.nextInt();
	   System.out.println(dividend+"를"+divisor+"로 나누면 몫은"+dividend/divisor+"이다");
	   
	   
	}

}
