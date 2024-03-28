package p.Part2;

public class AssigOper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y,z=0;
		x=y=z=100;
		z+=x+y;
		x+=y-=z*5;
		x+=y=z;
		
		System.out.println("x= "+x+", y="+y+", z="+z);
	}

}
