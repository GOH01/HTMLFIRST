package p0126;
import javax.swing.*;
import java.awt.*;

public class GraphicsDrawImageEx1 extends JFrame{
	Container contentPane;
	GraphicsDrawImageEx1(){
		setTitle("원본 크기로 원하는 위치에 이미지그리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		setSize(300,400);
		setVisible(true);
	}
	class MyPanel extends JPanel{
		ImageIcon icon=new ImageIcon("C:\\Users\\권오현\\Desktop\\bb.jpg");
		Image img=icon.getImage();
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, 20, 20, this);
		}
	}
	public static void main(String[] args) {
		new GraphicsDrawImageEx1();

	}

}
