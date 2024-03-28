package p0126;
import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class GraphicsDrawLineMouseEx extends JFrame{
	GraphicsDrawLineMouseEx(){
		setTitle("마우스로 여러 개의 선 그리기예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		setSize(300,300);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new GraphicsDrawLineMouseEx();

	}
	class MyPanel extends JPanel{
		Vector <Point> vStart=new Vector<Point>();
		Vector <Point> vEnd=new Vector<Point>();
		
		public MyPanel() {
			addMouseListener(new MouseAdapter(){
				public void mousePressed(MouseEvent e) {
					Point startP=e.getPoint();
					vStart.add(startP);
				}
				public void mouseReleased(MouseEvent e) {
					Point endP=e.getPoint();
					vEnd.add(endP);
					repaint();
				}
			});
		}
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.BLUE);
			for(int i=0; i<vStart.size(); i++) {
				Point s=vStart.elementAt(i);
				Point e= vEnd.elementAt(i);
				g.drawLine((int)s.getX(), (int)s.getY(), (int)e.getX(),(int)e.getY());
			}
		}
	}
}
