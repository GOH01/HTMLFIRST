package p.Part2;

public class IncrOper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,d;
		a=b=c=d=10;
		for(int i=0; i<5; i++) {
			System.out.println("x="+(a++)+", b="+(++b)+
					", c="+(c--)+", d="+(--d));
		}
	}

}
