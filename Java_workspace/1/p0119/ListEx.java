package p0119;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ListEx extends JFrame{
	String[] fruits= {"apple","banana","kiwi","pear","peach","berry","straberry","blackberry"};
	ImageIcon[] images= {new ImageIcon("C:\\Users\\권오현\\Desktop\\b.jpg"),
			new ImageIcon("C:\\Users\\권오현\\Desktop\\d.jpg"),
			new ImageIcon("C:\\Users\\권오현\\Desktop\\e.jpg"),
			new ImageIcon("C:\\Users\\권오현\\Desktop\\f.jpg")
	};
	ListEx(){
		setTitle("리스트 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		JList strList=new JList(fruits);
		c.add(strList);
		JList imageList=new JList();
		imageList.setListData(images);
		c.add(imageList);
		JList scrollList=new JList(fruits);
		c.add(new JScrollPane(scrollList));
		
		setSize(500,700);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ListEx();

	}

}
