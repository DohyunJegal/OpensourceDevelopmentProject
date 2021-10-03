package practice.chap04;
import java.util.Scanner;

class Grade {
	private int math;
	private int science;
	private int english;

	Grade(int a, int b, int c) {
		this.math = a;
		this.science = b;
		this.english = c;
	}

	public int average() {
		return (math + science + english) / 3;
	}
}

public class Q2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("����, ����, ���� ������ 3���� ���� �Է� >> ");

		int math = scanner.nextInt();
		int science = scanner.nextInt();
		int english = scanner.nextInt();

		Grade me = new Grade(math, science, english);

		System.out.println("����� " + me.average());

		scanner.close();
	}
}
