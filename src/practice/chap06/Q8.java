package practice.chap06;
import java.util.Scanner;

public class Q8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("���ڿ��� �Է��ϼ���. ��ĭ�̳� �־ �ǰ� ���� �ѱ� ��� �˴ϴ�.");
		String input = scanner.nextLine();
		
		for(int i = 1; i <= input.length() ;i++) {
			System.out.print(input.substring(i));
			System.out.println(input.substring(0, i));
		}
		scanner.close();
	}
}