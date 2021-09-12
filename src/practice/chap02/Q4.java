package practice.chap02;
import java.util.Scanner;

public class Q4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수 3개를 입력하세요 >> ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		if((a>b && b>c)||(c>b && b>a))
			System.out.println("중간 값은 " + b);
		else if ((b>a && a>c)||(c>a && a>b))
			System.out.println("중간 값은 " + a);
		else
			System.out.println("중간 값은 " + c);
		
		scanner.close();
	}
}
