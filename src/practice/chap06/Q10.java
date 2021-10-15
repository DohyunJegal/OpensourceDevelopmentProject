package practice.chap06;

import java.util.Scanner;

class Person {
	private int numA, numB, numC;
	public String name;

	public Person(String name) {
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

public class Q10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String temp;
		
		System.out.print("1번째 선수 이름 >> ");
		String name = scanner.next();
		Person userA = new Person(name);
		
		System.out.print("2번째 선수 이름 >> ");
		name = scanner.next();
		Person userB = new Person(name);
		
		do {
			System.out.print("[" + userA.name + "] : <Enter> ");
			temp = scanner.nextLine();
			
			if (userA.game()) {
				System.out.println(userA.name + "님이 이겼습니다!");
				break;
			}
			else 
				System.out.println("아쉽군요!");
			
			System.out.print("[" + userB.name + "] : <Enter> ");
			temp = scanner.nextLine();
			
			if (userB.game()) {
				System.out.println(userB.name + "님이 이겼습니다!");
				break;
			}
			else
				System.out.println("아쉽군요!");
		} while (true);
		
		scanner.close();
	}
}