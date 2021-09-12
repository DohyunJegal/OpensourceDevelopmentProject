package practice.chap02;
import java.util.Scanner;

public class Q2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = 0;
		
		do {
			System.out.print("2자리수 정수 입력 (10~99) >> ");
			input = scanner.nextInt();
		} while (input<10||input>=100);
		
		if(input/10 == input%10)
			System.out.println("10의 자리와 1의 자리가 같습니다.");
		else
			System.out.println("10의 자리와 1의 자리가 다릅니다.");

		scanner.close();
	}
}
