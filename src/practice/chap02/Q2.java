package practice.chap02;
import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = 0;
		
		do {
			System.out.print("2�ڸ��� ���� �Է� (10~99) >> ");
			input = scanner.nextInt();
		} while (input<10||input>=100);
		
		if(input/10 == input%10)
			System.out.println("10�� �ڸ��� 1�� �ڸ��� �����ϴ�.");
		else
			System.out.println("10�� �ڸ��� 1�� �ڸ��� �ٸ��ϴ�.");

		scanner.close();
	}
}
