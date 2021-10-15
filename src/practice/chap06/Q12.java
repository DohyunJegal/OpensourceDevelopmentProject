package practice.chap06;

import java.util.Scanner;

class Person2 {
	private int numA, numB, numC;
	public String name;

	public Person2(String name) {
		this.name = name;
	}

	public boolean game() {
		numA = (int) ((Math.random() * 3) + 1);
		numB = (int) ((Math.random() * 3) + 1);
		numC = (int) ((Math.random() * 3) + 1);

		System.out.print("\t" + numA + "  " + numB + "  " + numC + "  ");

		if (numA == numB && numB == numC)
			return true;
		else
			return false;
	}
}

public class Q12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int user;
		String temp;

		System.out.print("갬블링 게임에 참여할 선수 숫자 >> ");
		user = scanner.nextInt();
		Person2[] person = new Person2[user];

		for (int i = 0; i < user; i++) {
			System.out.print((i + 1) + "번째 선수 이름 >> ");
			String name = scanner.next();
			person[i] = new Person2(name);
		}

		do {
			for (int j = 0; j < user; j++) {
				System.out.print("[" + person[j].name + "] : <Enter> ");
				temp = scanner.nextLine();

				if (person[j].game()) {
					System.out.println(person[j].name + "님이 이겼습니다!");
					return;
				} else
					System.out.println("아쉽군요!");
			}

		} while (true);
	}
}