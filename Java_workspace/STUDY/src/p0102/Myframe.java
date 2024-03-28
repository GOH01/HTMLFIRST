package p0102;
import javax.swing.*;

public class Myframe extends JFrame{
	Myframe(){
		setTitle("300x300 스윙 프레임 만들기");
		
		setSize(300,300);
		
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new Myframe();
	}
}
