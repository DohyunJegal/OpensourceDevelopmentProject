package practice.chap10;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Q4 extends JFrame {
	String str = new String("Love Java");
	JLabel label = new JLabel(str);
	int i = 1;

	public Q4() {
		setTitle("Left 키로 문자열 이동");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.addKeyListener(new MyKeyListener());
		c.add(label);

		setSize(400, 250);
		setVisible(true);

		c.setFocusable(true);
		c.requestFocus();
	}

	class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();

			switch (keyCode) {
			case KeyEvent.VK_LEFT:
				label.setText(str.substring(i) + str.substring(0, i));
				i++;
				i %= str.length();
				break;
			}
		}
	}

	public static void main(String[] args) {
		new Q4();
	}
}