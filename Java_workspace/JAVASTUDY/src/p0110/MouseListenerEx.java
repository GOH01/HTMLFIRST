package p0110;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MouseListenerEx extends JFrame {
	JLabel la= new JLabel("Hello");
	JLabel lab=new JLabel("world");
	MouseListenerEx(){
		setTitle("Mouse 이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c= getContentPane();
		c.addMouseListener(new MyMouseListener());
		c.setLayout(null);
		la.setSize(50,20);
		la.setLocation(30,30);
		c.add(la);
		setSize(200,200);
		setVisible(true);
		
		lab.setSize(50,50);
		lab.setLocation(50,50);
		c.add(lab);
	}
	class MyMouseListener implements MouseListener{
		public void mousePressed(MouseEvent e) {
			int x=e.getX();
			int y=e.getY();
			la.setLocation(x,y);
		}
		public void mouseReleased(MouseEvent e) {}
		public void mouseClicked(MouseEvent e) {
			int x=e.getX();
			int y=e.getY();
			lab.setLocation(x,y);
		}
		public void mouseEntered(MouseEvent e) {}
		public void mouseExited(MouseEvent e) {}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MouseListenerEx();
	}

}
