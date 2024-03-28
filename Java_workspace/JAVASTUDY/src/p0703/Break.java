package p0703;
import java.util.Scanner;
public class Break {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		String s;
		
		System.out.println("exit을 입력하면 종료");
		while(true)
		{
			System.out.print(">>");
			s=scan.nextLine();
			
			if(s.equals("exit"))
			{
				break;
			}
		}
		scan.close();

	}

}
