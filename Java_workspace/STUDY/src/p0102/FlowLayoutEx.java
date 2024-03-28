package p0102;
import javax.swing.*;
import java.awt.*;

public class FlowLayoutEx extends JFrame {
	FlowLayoutEx(){
		setTitle("FlowLayout 활용");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container cp=getContentPane();
		cp.setLayout(new FlowLayout(FlowLayout.CENTER,30,40));
		cp.add(new JButton("add"));
		cp.add(new JButton("sub"));
		cp.add(new JButton("mul"));
		cp.add(new JButton("div"));
		cp.add(new JButton("Calculate"));
		setSize(300,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new FlowLayoutEx();

	}

}
