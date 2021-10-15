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
		System.out.print(name + " 시작 <Enter>키 >> ");
		temp = scanner.nextLine();
		now = Calendar.getInstance();
		seconds = now.get(Calendar.SECOND);
		System.out.print("\t현재 초 시간 = " + seconds + "\n10초 예상 후 <Enter>키 >> ");
		
		temp = scanner.nextLine();
		now = Calendar.getInstance();
		input = now.get(Calendar.SECOND);
		System.out.println("\t현재 초 시간 = " + input);
		
		if(seconds < input)
			return input - seconds;
		else 
			return (60 - seconds) + input;
	}
}

public class Q6 {
	public static void main(String[] args) {
		int resultA, resultB;
		
		data playerA = new data("황기태");
		data playerB = new data("이재문");
		
		System.out.println("10초에 가까운 사람이 이기는 게임입니다.");	
		resultA = playerA.game();
		resultB = playerB.game();
		
		if (Math.abs(resultA - 10) < Math.abs(resultB - 10))
			System.out.println("황기태의 결과 : " + resultA + ", 이재문의 결과 : " + resultB + ", 승자는 황기태");
		else
			System.out.println("황기태의 결과 : " + resultA + ", 이재문의 결과 : " + resultB + ", 승자는 이재문");
	}
}
