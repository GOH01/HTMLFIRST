package p0703;
import java.util.Scanner;
import java.util.InputMismatchException;

public class InputException {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("정수 3개 입력:");
		int sum=0;
		int n=0;
		
		for(int i=0; i<3; i++)
		{
			System.out.print(i+">>");
			try
			{
				n=scan.nextInt();
			}
			catch(InputMismatchException e)
			{
				System.out.println("정수가 아님 다시 입력!");
				scan.next();
				i--;
				continue;
			}
			sum+=n;
		}
		System.out.print("세 정수의 합은"+sum+"이다");
		scan.close();
		

	}

}
