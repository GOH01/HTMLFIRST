package p0105;
import javax.swing.*;
import java.awt.*;

public class NullContainerEx extends JFrame {
	NullContainerEx(){
		super("NullContainer 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane=getContentPane();
		contentPane.setLayout(null);
		JLabel la=new JLabel("Hello, Press Buttons!");
		la.setLocation(200,60);
		la.setSize(200,20);
		contentPane.add(la);
		
		int x=50;
		int y=50;
		
		for(int i=1; i<10; i++) {
			String text=Integer.toString(i);
			JButton button=new JButton(text);
			button.setSize(100,40);
			button.setLocation(x,y);
			contentPane.add(button);
			x+=30;
			y+=20;
		}
		setSize(1000,1000);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new NullContainerEx();

	}

}
