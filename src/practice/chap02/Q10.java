package practice.chap02;
import java.util.Scanner;

public class Q10 {
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	        
	    System.out.print("ù��° ���� �߽ɰ� ������ �Է� >> ");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int r1 = scanner.nextInt();
	        
        System.out.print("�ι�° ���� �߽ɰ� ������ �Է� >> ");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        int r2 = scanner.nextInt();
	        
        double d = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
	        
        if (d < r1+r2)
            System.out.print("�� ���� ���� ��ģ��.");
        else
            System.out.print("�� ���� ���� ��ġ�� �ʴ´�.");
        
        scanner.close();
	}
}
