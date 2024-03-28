package p0821;
import java.util.Scanner;

class Book{
	String title,author;
	
	public Book(String title, String author) {
		this.title=title;
		this.author=author;
	}
}
public class BookArray {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		Book []b;
		b=new Book[2];
		
		for(int i=0; i<b.length; i++)
		{
			b[i]=new Book(scan.nextLine(),scan.nextLine());
		}
		for(int i=0; i<b.length; i++)
		{
			System.out.print("("+b[i].title+","+b[i].author+")");
		}

	}

}
