package p.Part2;

public class LogiOper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=20; int y=30; int z=40;
		boolean a,b,c,d;
		
		System.out.println(x+"<"+y+" AND "+y+"<"+z+"="+(x<y && y<z));
		System.out.println(x+"<"+y+" OR "+y+"<"+z+"="+(x<y || y<z));
		
		a=true;
		b=c=false;
		d=a||b&&c;
		System.out.println("a= "+a+",b= "+b+", c= "+c+", d="+d);

	}

}
