package practice.chap06;
import java.util.Scanner;
import java.util.Calendar;

class data{
	Scanner scanner = new Scanner(System.in);
	Calendar now = Calendar.getInstance();
	private String name, temp;
	private int seconds, input;
	
	public data(String name) {
		this.name = name;
	}
	public int game() {
		System.out.print(name + " ���� <Enter>Ű >> ");
		temp = scanner.nextLine();
		now = Calendar.getInstance();
		seconds = now.get(Calendar.SECOND);
		System.out.print("\t���� �� �ð� = " + seconds + "\n10�� ���� �� <Enter>Ű >> ");
		
		temp = scanner.nextLine();
		now = Calendar.getInstance();
		input = now.get(Calendar.SECOND);
		System.out.println("\t���� �� �ð� = " + input);
		
		if(seconds < input)
			return input - seconds;
		else 
			return (60 - seconds) + input;
	}
}

public class Q6 {
	public static void main(String[] args) {
		int resultA, resultB;
		
		data playerA = new data("Ȳ����");
		data playerB = new data("���繮");
		
		System.out.println("10�ʿ� ����� ����� �̱�� �����Դϴ�.");	
		resultA = playerA.game();
		resultB = playerB.game();
		
		if (Math.abs(resultA - 10) < Math.abs(resultB - 10))
			System.out.println("Ȳ������ ��� : " + resultA + ", ���繮�� ��� : " + resultB + ", ���ڴ� Ȳ����");
		else
			System.out.println("Ȳ������ ��� : " + resultA + ", ���繮�� ��� : " + resultB + ", ���ڴ� ���繮");
	}
}
