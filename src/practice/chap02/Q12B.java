package practice.chap02;
import java.util.Scanner;

public class Q12B {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        System.out.print("���� >> ");
        int a = scanner.nextInt();
        String s = scanner.next();
        int b = scanner.nextInt();
        
        switch(s){
            case "+":
                System.out.println(a+s+b+"�� ��� ����� "+(a+b));
                break;
            case "-":
                System.out.println(a+s+b+"�� ��� ����� "+(a-b));
                break;
            case "*":
                System.out.println(a+s+b+"�� ��� ����� "+(a*b));
                break;
            case "/" :
                if(b==0)
                    System.out.println("0���� ���� �� �����ϴ�.");
                else
                    System.out.println(a+s+b+"�� ��� ����� "+(a/b));
                break;
        }
            
        scanner.close();
	}
}
