package p0123;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MenuActionEventEx extends JFrame{
	JLabel imgLabel=new JLabel();
	MenuActionEventEx(){
		setTitle("Menu에 Action 리스너 만들기 예제");
		createMenu();
		getContentPane().add(imgLabel, BorderLayout.CENTER);
		setSize(250,200);
		setVisible(true);
	}
	void createMenu() {
		JMenuBar mb=new JMenuBar();
		JMenuItem[] menuItem=new JMenuItem[4];
		String[] itemTitle= {"Load","Hide","ReShow","Exit"};
		JMenu screenMenu=new JMenu("Screen");
		MenuActionListener listener=new MenuActionListener();
		for(int i=0; i<menuItem.length; i++) {
			menuItem[i]=new JMenuItem(itemTitle[i]);
			menuItem[i].addActionListener(listener);
			screenMenu.add(menuItem[i]);
		}
		mb.add(screenMenu);
		setJMenuBar(mb);
	}
	class MenuActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			String cmd=e.getActionCommand();
			switch(cmd) {
			case "Load":
				if(imgLabel.getIcon()!=null)
					return;
				imgLabel.setIcon(new ImageIcon("C:/Users/권오현/eclipse-workspace/JAVA STUDY/src/p0123/bb.jpg"));
				break;
			case "Hide":
				imgLabel.setVisible(false);
				break;
			case "ReShow":
				imgLabel.setVisible(true);
				break;
			case "Exit":
				System.exit(0);
				break;
			}
		}
	}
	public static void main(String[] args) {
		new MenuActionEventEx();

	}

}