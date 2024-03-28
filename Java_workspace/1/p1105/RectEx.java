package p1105;

class Ract{
	int width, height;
	public Ract(int width, int height){
		this.width=width;
		this.height=height;
	}
	boolean equals(Ract p)
	{
		if(width*height==p.width*p.height) {
			return true;
		}
		else {
			return false;
		}
	}
}
public class RectEx {

	public static void main(String[] args) {
		Ract a=new Ract(2,3);
		Ract b=new Ract(3,2);
		Ract c=new Ract(3,4);
		
		
		if(a.equals(b)) {
			System.out.println("a is equal to b");
		}
		else {
			System.out.println("a is not equal to b");
		}
		
		if(a.equals(c)) {
			System.out.println("a is equal to c");
		}
		else {
			System.out.println("a is not equal to c");
		}
		
		if(b.equals(c)) {
			System.out.println("b is equal to c");
		}
		else {
			System.out.println("b is not equal to c");
		}
		
	
	}

}
