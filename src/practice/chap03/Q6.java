package practice.chap03;
import java.util.Scanner;

public class Q6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int [] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
		
		System.out.print("�ݾ��� �Է��ϼ��� >> ");
		int money = scanner.nextInt();
		
		for(int i=0; i<8; i++) {
			if(money/unit[i]!=0) {
				System.out.println(unit[i]+"�� ¥�� : "+money/unit[i]+"��");
				money -= unit[i]*(money/unit[i]);
			}
		}
		
		scanner.close();
	}
}
