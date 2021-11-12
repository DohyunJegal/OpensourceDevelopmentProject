package practice.chap10;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Q6 extends JFrame {
	JLabel label = new JLabel("C");

	public Q6() {
		setTitle("클릭 연습용 응용프로그램");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		c.add(label);
		
		MyMouseListener listener = new MyMouseListener();
		
		label.setLocation(100, 100);
		label.setSize(20, 20);
		
		setSize(400, 400);
		setVisible(true);
		
		label.addMouseListener(listener);
		label.setFocusable(true);
		label.requestFocus(); 
	}

	class MyMouseListener extends MouseAdapter {
		public void mouseClicked(MouseEvent e) {
			JLabel label = (JLabel) e.getSource();
			int x = (int) (Math.random() * 350);
			int y = (int) (Math.random() * 350);
			label.setLocation(x, y);
		}
	}

	public static void main(String[] args) {
		new Q6();
	}
}