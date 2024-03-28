package p0703;
import java.util.Scanner;
public class Pass_nonpass {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.print("점수입력:");
		int score=scan.nextInt();
		
		System.out.print("학년 입력:");
		int grade=scan.nextInt();
		
		if(grade==4)
		{
			if(score>=70)
			{
				System.out.print("합격");
			}
			else
			{
				System.out.print("불합격");
			}
		}
		else
		{
			if(score>=60)
			{
				System.out.print("합격");
			}
			else
			{
				System.out.print("불합격");
			}
		}
		scan.close();
	}

}
