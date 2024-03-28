package p0703;
import java.util.Scanner;
public class ScannerEx {
	public static void main(String[] args) {
		System.out.println("이름,도시,나이,체중,결혼여부를 빈칸으로 분리하여 입력");
		Scanner scan=new Scanner(System.in);
		
		String name=scan.next();
		System.out.println("이름" + name);
		
		String city=scan.next();
		System.out.println("도시" + city);
		
		int age=scan.nextInt();
		System.out.println("나이" + age);
		
		double weight=scan.nextDouble();
		System.out.println("체중" + weight);
		
		boolean single=scan.nextBoolean();
		System.out.println("결혼여부" + single);
		
		scan.close();
	}

}
