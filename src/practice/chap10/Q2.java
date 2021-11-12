package practice.chap10;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Q2 extends JFrame {
	public Q2() {
		setTitle("µå·¡±ëµ¿¾È YELLOW");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		MyMouseListener listener = new MyMouseListener(); 
		c.addMouseListener(listener);
		c.addMouseMotionListener(listener);
		
		c.setBackground(Color.GREEN);
		setSize(400,250);
		setVisible(true);
	}
	
	class MyMouseListener implements MouseListener, MouseMotionListener {
		public void mouseDragged(MouseEvent e) {
			Component c = (Component)e.getSource();
			c.setBackground(Color.YELLOW);
			}
		public void mousePressed(MouseEvent e) {
			Component c = (Component)e.getSource();
			c.setBackground(Color.GREEN);
		}
		public void mouseReleased(MouseEvent e) {
			Component c = (Component)e.getSource();
			c.setBackground(Color.GREEN);
		}
		public void mouseEntered(MouseEvent e) {
			Component c = (Component)e.getSource();
			c.setBackground(Color.GREEN);
		}
		public void mouseClicked(MouseEvent e) {
			Component c = (Component)e.getSource();
			c.setBackground(Color.GREEN);
		}
		public void mouseExited(MouseEvent e) {
			Component c = (Component)e.getSource();
			c.setBackground(Color.GREEN);
		}
		public void mouseMoved(MouseEvent e) {
			Component c = (Component)e.getSource();
			c.setBackground(Color.GREEN);
		}
	}
	
	public static void main(String [] args) {
		new Q2();
	}
}