package p0703;
import java.util.Scanner;
public class Grade {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		System.out.print("점수 입력:");
		int grade=scan.nextInt();
		
		if(grade<=100 && grade>=90)
		{
			System.out.print("학점은 A");
		}
		else if(grade<90 && grade>=80)
		{
			System.out.print("학점은 B");
		}
		else if(grade<80 && grade>=70)
		{
			System.out.print("학점은 C");
		}
		else if(grade<70 && grade>=60)
		{
			System.out.print("학점은 D");
		}
		else
		{
			System.out.print("학점은 F");
		}
		
		scan.close();

	}

}
