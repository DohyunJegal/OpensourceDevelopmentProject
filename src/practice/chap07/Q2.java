package practice.chap07;
import java.util.*;

public class Q2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Character> stack = new ArrayList<Character>();
		
		int sum = 0;
		double average = 0;

		System.out.print("6개의 학점을 빈 칸으로 분리 입력 (A/B/C/D/F) >> ");

		for (int i = 0; i < 6; i++) {
			char c = scanner.next().charAt(0);
			stack.add(c);
		}
		
		for (int i = 0; i < stack.size(); i++) {
			char c = stack.get(i);
			switch (c) {
			case 'A':
				sum += 4;
				break;
			case 'B':
				sum += 3;
				break;
			case 'C':
				sum += 2;
				break;
			case 'D':
				sum += 1;
				break;
			case 'F':
				sum += 0;
				break;
			}
		}
	
		average = (double) sum / stack.size();
		System.out.println(average);
		
		scanner.close();
	}
}