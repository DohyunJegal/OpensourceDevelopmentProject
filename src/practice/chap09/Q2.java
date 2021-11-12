package practice.chap09;
import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Q2 extends JFrame {
	public Q2() {
		setTitle("BorderLayout Practice");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout(5, 7));
		c.add(new JButton("North"), BorderLayout.NORTH);
		c.add(new JButton("West"), BorderLayout.WEST);
		c.add(new JButton("Center"), BorderLayout.CENTER);
		c.add(new JButton("East"), BorderLayout.EAST);
		c.add(new JButton("South"), BorderLayout.SOUTH);

		setSize(400, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Q2();
	}
}