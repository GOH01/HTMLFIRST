package p0110;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;


public class InnerClassListener extends JFrame {
	InnerClassListener(){
		setTitle("Action 이벤트 리스너 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c= getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn=new JButton("Action");
		btn.addActionListener(new MyActionListener());
		c.add(btn);
		setSize(250,120);
		setVisible(true);
	}
	private class MtActionClassListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			JButton b=(JButton)e.getSource();
			if(b.getText().equals("Action"))
				b.setText("액션");
			else
				b.setText("Action");
		}
}
	public static void main(String[] args) {
		new InnerClassListener();

	}

}
