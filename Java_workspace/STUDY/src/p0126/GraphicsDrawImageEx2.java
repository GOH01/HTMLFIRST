package p0126;
import java.awt.*;
import javax.swing.*;

public class GraphicsDrawImageEx2 extends JFrame{
	Container contentPane;
	GraphicsDrawImageEx2(){
		setTitle("패널크기에 맞추어 이미지그리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(new MyPanel());
		setSize(200,300);
		setVisible(true);
	}
	class MyPanel extends JPanel{
		ImageIcon icon=new ImageIcon("C:\\Users\\권오현\\Desktop\\bb.jpg");
		Image img=icon.getImage();
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, 0,0,getWidth(),getHeight(),this);
		}
	}
	public static void main(String[] args) {
		new GraphicsDrawImageEx2();

	}
}
