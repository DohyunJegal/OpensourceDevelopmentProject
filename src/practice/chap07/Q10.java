package practice.chap07;
import java.util.*;

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
	public void draw() {
		System.out.println("Line");
	}
}

class Rect extends Shape {
	public void draw() {
		System.out.println("Rect");
	}
}

class Circle extends Shape {
	public void draw() {
		System.out.println("Circle");
	}
}

public class Q10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Vector<Shape> vec = new Vector<Shape>();

		Shape shape = null;
		
		System.out.println("그래픽 에디터 beauty을 실행합니다.");
		
		while (true) {
			System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4) >> ");
			int input = scanner.nextInt();
			
			switch (input) {
			case 1:
				System.out.print("Line(1), Rect(2), Circle(3) >> ");
				int input2 = scanner.nextInt();
				switch (input2) {
				case 1:
					shape = new Line();
					break;
				case 2:
					shape = new Rect();
					break;
				case 3:
					shape = new Circle();
					break;
				}
				vec.add(shape);
				break;
			case 2:
				System.out.print("삭제할 도형의 위치 >> ");
				int i = scanner.nextInt();
				if (vec.size() == 0 || vec.size() <= i)
					System.out.println("삭제할 수 없습니다.");
				else
					vec.remove(i);
				break;
			case 3:
				for (int j = 0; j < vec.size(); j++)
					vec.get(j).draw();
				break;
			case 4:
				System.out.println("beauty을 종료합니다.");
				scanner.close();
				return;
			}
		}
	}
}
