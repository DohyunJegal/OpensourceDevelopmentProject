package practice.chap02;
import java.util.Scanner;

public class Q10 {
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	        
	    System.out.print("첫번째 원의 중심과 반지름 입력 >> ");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int r1 = scanner.nextInt();
	        
        System.out.print("두번째 원의 중심과 반지름 입력 >> ");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        int r2 = scanner.nextInt();
	        
        double d = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
	        
        if (d < r1+r2)
            System.out.print("두 원은 서로 겹친다.");
        else
            System.out.print("두 원은 서로 겹치지 않는다.");
        
        scanner.close();
	}
}
