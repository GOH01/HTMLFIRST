package p0703;
import java.util.Scanner;
public class Season {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		System.out.print("달 입력:");
		int month=scan.nextInt();
		
		switch(month)
		{
		case 12: case 1: case 2:
			System.out.print("겨울");
			break;
		case 3: case 4: case 5:
			System.out.print("봄");
			break;
		case 6: case 7: case 8:
			System.out.print("여름");
			break;
		case 9: case 10: case 11:
			System.out.print("가을");
			break;
			
			default:
				System.out.print("잘못된 입력");
		}
		scan.close();
	}

}
