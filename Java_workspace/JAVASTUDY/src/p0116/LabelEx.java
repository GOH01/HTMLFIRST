package p0116;
import javax.swing.*;
import java.awt.*;

public class LabelEx extends JFrame{
	LabelEx(){
		setTitle("레이블 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		JLabel textLabel=new JLabel("제임스고슬링입니다.");
		ImageIcon img=new ImageIcon("C:\\Users\\권오현\\Desktop\\dd.jpg");
		JLabel imageLabel=new JLabel(img);
		ImageIcon icon=new ImageIcon("C:\\Users\\권오현\\Desktop\\ww.jpg");
		JLabel label=new JLabel("커피 한 잔 하실래예, 전화 주이소",icon,SwingConstants.CENTER);
		c.add(textLabel);
		c.add(imageLabel);
		c.add(label);
		setSize(300,500);
		setVisible(true);
		
				
	}
	public static void main(String[] args) {
		new LabelEx();

	}

}
