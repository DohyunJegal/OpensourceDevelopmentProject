package practice.chap02;
import java.util.Scanner;

public class Q12A {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        System.out.print("연산 >> ");
        int a = scanner.nextInt();
        String s = scanner.next();
        int b = scanner.nextInt();
        
        if(s.equals("+"))
            System.out.println(a+s+b+"의 계산 결과는 "+(a+b));
        else if(s.equals("-"))
            System.out.println(a+s+b+"의 계산 결과는 "+(a-b));
        else if(s.equals("*"))
            System.out.println(a+s+b+"의 계산 결과는 "+(a*b));
        else if(s.equals("/"))
            if(b==0){
                System.out.println("0으로 나눌 수 없습니다.");
            }
            else
                System.out.println(a+s+b+"의 계산 결과는 "+(a/b));
            
        scanner.close();
	}
}
