package p0130;

import java.awt.*;
import javax.swing.*;

public class TimerThreadEx extends JFrame {
	public TimerThreadEx() {
		setTitle("Thread를 상속 받은 타이머 스레드 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel timerLabel=new JLabel();
		timerLabel.setFont(new Font("Gothic",Font.ITALIC,80));
		c.add(timerLabel);
		
		TimerThread th=new TimerThread(timerLabel);
		setSize(250,150);
		setVisible(true);
		th.start();
	}
	public static void main(String[] args) {
		new TimerThreadEx();

	}

}
