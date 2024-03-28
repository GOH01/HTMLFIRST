package p0703;

public class Rectangle {
   int width;
   int height;
   public int getArea() {
	   return width*height;
   }
	public static void main(String[] args) {
		Rectangle notebook=new Rectangle();
		notebook.width=4;
		notebook.height=5;
		int area=notebook.getArea();
		
		System.out.println("사각형의 면적:"+area);

	}

}
