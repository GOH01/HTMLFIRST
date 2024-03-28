package p0703;

public class CircleArea {

	public static void main(String[] args) {
		final double PI=3.14;
		double r=10.2;
		double s;
		
		s=r*r*PI;
		
		System.out.print("반지름=");
		System.out.println(r);
		System.out.print("원의 면적=");
		System.out.println(s);
		System.out.println(String.format("%.3f", s));

	}

}
