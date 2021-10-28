package practice.chap07;
import java.util.*;

public class Q4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Vector<Integer> stack = new Vector<Integer>();
		
		int num = 0, sum = 0;
		
		do {
			System.out.print("강수량 입력 (0 입력시 종료) >> ");
			num = scanner.nextInt();
			
			if(num == 0)
				break;
			
			stack.add(num);
			
			for(int i=0; i<stack.size(); i++) {
				System.out.print(stack.get(i) + " ");
				sum += stack.get(i);
			}
			System.out.println();
			
			System.out.println("현재 평균 : " + sum / stack.size());
		} while(true);
		
		scanner.close();
	}
}
