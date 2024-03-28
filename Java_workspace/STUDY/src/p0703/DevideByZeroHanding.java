package p0703;
import java.util.Scanner;
public class DevideByZeroHanding {

	public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
		
		int dividend;
		int divisor;
		
		System.out.print("피젯수 입력");
		dividend=scan.nextInt();
		System.out.print("젯수 입력");
		divisor=scan.nextInt();
		
		try
		{
			System.out.println(dividend+"를"+divisor+"로 나눈 몫은"+dividend/divisor+"이다");
		}
		catch(ArithmeticException e)
		{
			System.out.println("0으로 나눌 수 없습니다.");
			System.out.println(e);
		}
		finally
		{
			scan.close();
		}

	}

}
