package practice.chap02;
import java.util.Scanner;

public class Q4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���� 3���� �Է��ϼ��� >> ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		if((a>b && b>c)||(c>b && b>a))
			System.out.println("�߰� ���� " + b);
		else if ((b>a && a>c)||(c>a && a>b))
			System.out.println("�߰� ���� " + a);
		else
			System.out.println("�߰� ���� " + c);
		
		scanner.close();
	}
}
