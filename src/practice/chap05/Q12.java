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
		System.out.println("그래픽 에디터 beauty를 실행합니다.");

		do {
			System.out.print("삽입 (1), 삭제 (2), 모두 보기 (3), 종료 (4) >> ");
			menu = scanner.nextInt();

			switch (menu) {
			case 1:
				System.out.print("Line (1), Rect (2), Circle (3) >> ");
				input = scanner.nextInt();
				insert(input);
				break;
			case 2:
				System.out.print("삭제할 도형의 위치 >> ");
				input = scanner.nextInt();
				delete(input);
				break;
			case 3:
				print();
				break;
			case 4:
				System.out.println("beauty를 종료합니다.");
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
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
			System.out.println("잘못 입력하셨습니다.");
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
	public void print() { // 전체 노드 출력
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
	            System.out.println("삭제할 수 없습니다.");
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
