package p0703;
import java.util.Scanner;
public class Age {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		System.out.print("나이입력:");
		int age=scan.nextInt();
		
		if(age<30 && age>=20)
		{
			System.out.println("20대라서 행복");
		}
		else
		{
			System.out.println("20대 아님");
		}
		
		scan.close();
		

	}

}
