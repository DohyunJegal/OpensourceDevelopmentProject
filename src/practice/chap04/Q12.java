package practice.chap04;
import java.util.Scanner;

class Seat {
	String seat[];

	public Seat() {
		seat = new String[10];
		for (int i = 0; i < 10; i++) {
			seat[i] = "---";
		}
	}

	public void inquiry() {
		for (int i = 0; i < 10; i++) {
			System.out.print(seat[i] + " ");
		}
		System.out.println();
	}

	public void reserv(String name, int num) {
		if (seat[--num].equals("---")) {
			seat[num] = name;
			System.out.println("<< ������ �Ϸ�Ǿ����ϴ�. >>");
		}
			
		else
			System.out.println("<< �¼��� �߸� �����ϼ̽��ϴ�. >>");
	}

	public boolean cancle(String name) {
		for (int i = 0; i < 10; i++) {
			if (seat[i].equals(name)) {
				seat[i] = "---";
				return true;
			}
		}
		return false;
	}
}

public class Q12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Seat seat[] = new Seat[3];
		for (int i = 0; i < 3; i++)
			seat[i] = new Seat();

		String Grade[] = { "S", "A", "B" };

		int menu;
		System.out.println("��ǰ�ܼ�ƮȦ ���� �ý����Դϴ�.");
		while (true) {
			System.out.print("\n����:1, ��ȸ:2, ���:3, ������:4 >> ");
			menu = scanner.nextInt();

			switch (menu) {
			case 1:
				System.out.print("�¼����� : S(1), A(2), B(3) >> ");
				int gradeR = scanner.nextInt();

				System.out.print(Grade[--gradeR] + " >> ");
				seat[gradeR].inquiry();

				System.out.print("�̸� >> ");
				String nameR = scanner.next();
				System.out.print("��ȣ >> ");
				int num = scanner.nextInt();
				seat[gradeR].reserv(nameR, num);

				break;
			case 2:
				for (int i = 0; i < 3; i++) {
					System.out.print(Grade[i] + " >> ");
					seat[i].inquiry();
				}
				System.out.println("<< ��ȸ�� �Ϸ��Ͽ����ϴ�. >>");
				break;
			case 3:
				System.out.print("�¼����� : S(1), A(2), B(3) >> ");
				int gradeC = scanner.nextInt();

				System.out.print(Grade[--gradeC] + " >> ");
				seat[gradeC].inquiry();

				System.out.print("�̸� >> ");
				String name = scanner.next();

				if (seat[gradeC].cancle(name))
					System.out.println("<< ��Ҹ� �Ϸ��Ͽ����ϴ�. >>");
				else
					System.out.println("<< �������� �ʴ� �̸��Դϴ�. >>");

				break;
			case 4:
				return;
			default:
				System.out.println("<< ���ڸ� �߸� �Է��ϼ̽��ϴ�. >>");
				break;
			}
		}
	}
}
