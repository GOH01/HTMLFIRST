package p0119;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ComboActionEx extends JFrame{
	String[] fruits= {"switch","stop","play"};
	ImageIcon[] images= {new ImageIcon("C:\\Users\\권오현\\Desktop\\d.jpg"),
			new ImageIcon("C:\\Users\\권오현\\Desktop\\e.jpg"),
			new ImageIcon("C:\\Users\\권오현\\Desktop\\f.jpg")};
	JLabel imageLabel=new JLabel(images[0]);
	
	ComboActionEx(){
		setTitle("콤보박스 활용 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		JComboBox combo=new JComboBox(fruits);
		c.add(combo);
		c.add(imageLabel);
		
		combo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JComboBox cb=(JComboBox)e.getSource();
				int index=cb.getSelectedIndex();
				imageLabel.setIcon(images[index]);
			}
		});
		setSize(300,250);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ComboActionEx();

	}

}
