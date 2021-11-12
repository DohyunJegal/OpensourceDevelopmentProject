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
			System.out.println("<< 예약이 완료되었습니다. >>");
		}
			
		else
			System.out.println("<< 좌석을 잘못 선택하셨습니다. >>");
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
		System.out.println("명품콘서트홀 예약 시스템입니다.");
		while (true) {
			System.out.print("\n예약:1, 조회:2, 취소:3, 끝내기:4 >> ");
			menu = scanner.nextInt();

			switch (menu) {
			case 1:
				System.out.print("좌석구분 : S(1), A(2), B(3) >> ");
				int gradeR = scanner.nextInt();

				System.out.print(Grade[--gradeR] + " >> ");
				seat[gradeR].inquiry();

				System.out.print("이름 >> ");
				String nameR = scanner.next();
				System.out.print("번호 >> ");
				int num = scanner.nextInt();
				seat[gradeR].reserv(nameR, num);

				break;
			case 2:
				for (int i = 0; i < 3; i++) {
					System.out.print(Grade[i] + " >> ");
					seat[i].inquiry();
				}
				System.out.println("<< 조회를 완료하였습니다. >>");
				break;
			case 3:
				System.out.print("좌석구분 : S(1), A(2), B(3) >> ");
				int gradeC = scanner.nextInt();

				System.out.print(Grade[--gradeC] + " >> ");
				seat[gradeC].inquiry();

				System.out.print("이름 >> ");
				String name = scanner.next();

				if (seat[gradeC].cancle(name))
					System.out.println("<< 취소를 완료하였습니다. >>");
				else
					System.out.println("<< 존재하지 않는 이름입니다. >>");

				break;
			case 4:
				return;
			default:
				System.out.println("<< 숫자를 잘못 입력하셨습니다. >>");
				break;
			}
		}
	}
}
