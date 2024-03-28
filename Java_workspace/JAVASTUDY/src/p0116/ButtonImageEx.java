package p0116;
import javax.swing.*;
import java.awt.*;

public class ButtonImageEx extends JFrame{
	ButtonImageEx(){
		setTitle("이미지 버튼 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		ImageIcon normalIcon=new ImageIcon("C:\\Users\\권오현\\Desktop\\a.jpg");
		ImageIcon rolloverIcon=new ImageIcon("C:\\Users\\권오현\\Desktop\\b.jpg");
		ImageIcon pressedIcon=new ImageIcon("C:\\Users\\권오현\\Desktop\\c.jpg");
		JButton btn=new JButton("불륨 up~~",normalIcon);
		btn.setPressedIcon(pressedIcon);
		btn.setRolloverIcon(rolloverIcon);
		
		c.add(btn);
		setSize(250,150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ButtonImageEx();

	}

}
