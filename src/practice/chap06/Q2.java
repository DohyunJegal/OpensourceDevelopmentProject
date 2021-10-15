package practice.chap06;

class Circle {
	int x, y, radius;

	public Circle(int x, int y, int rad) {
		this.x = x;
		this.y = y;
		this.radius = rad;
	}

	public String toString() {
		return "Circle(" + x + ", " + y + ") ������ " + radius;
	}

	public boolean equals(Object obj) {
		Circle p = (Circle) obj;
		
		if (p.x == x && p.y == y) // �߽��� ������ ���� ���̴�.
			return true;
		else
			return false;
	}
}

public class Q2 {
	public static void main(String[] args) {
		Circle a = new Circle(2, 3, 5);
		Circle b = new Circle(2, 3, 30);

		System.out.println("�� a : " + a);
		System.out.println("�� b : " + b);

		if (a.equals(b))
			System.out.println("���� ��");
		else
			System.out.println("�ٸ� ��");
	}

}