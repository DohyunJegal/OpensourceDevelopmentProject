package practice.chap05;
import java.util.Scanner;

abstract class Shape {
	private Shape next;

	public Shape() {
		next = null;
	}
	public void setNext(Shape obj) {
		next = obj;
	}
	public Shape getNext() {
		return next;
	}
	public abstract void draw();
}

class Line extends Shape {
	@Override
	public void draw() {
		System.out.println("Line");
	}
}

class Rect extends Shape {
	@Override
	public void draw() {
		System.out.println("Rect");
	}
}

class Circle extends Shape {
	@Override
	public void draw() {
		System.out.println("Circle");
	}
}

class GraphicEditor {
	private Scanner scanner;
	private Shape head, tail;
	int menu, input;

	public GraphicEditor() {
		head = null;
		tail = null;
		scanner = new Scanner(System.in);
	}
	public void mainMenu() {
		System.out.println("�׷��� ������ beauty�� �����մϴ�.");

		do {
			System.out.print("���� (1), ���� (2), ��� ���� (3), ���� (4) >> ");
			menu = scanner.nextInt();

			switch (menu) {
			case 1:
				System.out.print("Line (1), Rect (2), Circle (3) >> ");
				input = scanner.nextInt();
				insert(input);
				break;
			case 2:
				System.out.print("������ ������ ��ġ >> ");
				input = scanner.nextInt();
				delete(input);
				break;
			case 3:
				print();
				break;
			case 4:
				System.out.println("beauty�� �����մϴ�.");
				break;
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
		} while (menu != 4);
	}
	public void insert(int input) {
		Shape shape = null;

		switch (input) {
		case 1:
			shape = new Line();
			break;
		case 2:
			shape = new Rect();
			break;
		case 3:
			shape = new Circle();
			break;
		default:
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			break;
		}

		if (head == null) {
			head = shape;
			tail = shape;
		} else {
			tail.setNext(shape);
			tail = shape;
		}
	}
	public void print() { // ��ü ��� ���
		Shape shape = head;
		while (shape != null) {
			shape.draw();
			shape = shape.getNext();
		}
	}
	public void delete(int num) {
	      Shape current = head;
	      Shape temp = head;
	      int i;
	      
	      if(num == 1) { 
	         if(head == tail) {
	            head = null;
	            tail = null;
	            return;
	         }
	         else {
	            head = head.getNext();
	            return;
	         }
	      }
	      
	      for(i = 1; i < num; i++) {
	         temp = current;
	         current = current.getNext();
	         
	         if(current == null) { 
	            System.out.println("������ �� �����ϴ�.");
	            return;
	         }
	      }
	      
	      if(i == num) {
	         temp.setNext(current.getNext());
	         tail = temp;
	      }
	      else
	         temp.setNext(current.getNext());
	}
}

public class Q12 {
	public static void main(String[] args) {
		GraphicEditor ge = new GraphicEditor();
        ge.mainMenu();
	}
}
