package practice.chap02;
import java.util.Scanner;

public class Q6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = 0;
		
		do {
			System.out.print("1~99 ������ ������ �Է��ϼ��� >> ");
			input = scanner.nextInt();
		} while (input<1||input>=100);
		
		if ((input/10)%3==0 && (input%10)%3==0)
			System.out.println("�ڼ�¦¦");
		else if (((input/10)%3==0 && (input%10)%3!=0) || ((input/10)%3!=0 && (input%10)%3==0))
			System.out.println("�ڼ�¦");
		
		scanner.close();
	}
}
