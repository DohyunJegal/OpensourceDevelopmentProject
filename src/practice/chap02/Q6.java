package practice.chap02;
import java.util.Scanner;

public class Q6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = 0;
		
		do {
			System.out.print("1~99 사이의 정수를 입력하세요 >> ");
			input = scanner.nextInt();
		} while (input<1||input>=100);
		
		if ((input/10)%3==0 && (input%10)%3==0)
			System.out.println("박수짝짝");
		else if (((input/10)%3==0 && (input%10)%3!=0) || ((input/10)%3!=0 && (input%10)%3==0))
			System.out.println("박수짝");
		
		scanner.close();
	}
}
