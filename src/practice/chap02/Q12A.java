package practice.chap02;
import java.util.Scanner;

public class Q12A {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        System.out.print("���� >> ");
        int a = scanner.nextInt();
        String s = scanner.next();
        int b = scanner.nextInt();
        
        if(s.equals("+"))
            System.out.println(a+s+b+"�� ��� ����� "+(a+b));
        else if(s.equals("-"))
            System.out.println(a+s+b+"�� ��� ����� "+(a-b));
        else if(s.equals("*"))
            System.out.println(a+s+b+"�� ��� ����� "+(a*b));
        else if(s.equals("/"))
            if(b==0){
                System.out.println("0���� ���� �� �����ϴ�.");
            }
            else
                System.out.println(a+s+b+"�� ��� ����� "+(a/b));
            
        scanner.close();
	}
}
