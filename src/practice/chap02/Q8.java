package practice.chap02;
import java.util.Scanner;

public class Q8 {
	public static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2){
        if((x >= rectx1 && x <= rectx2) && (y >= recty1 && y <= recty2))
            return true;
        else return false;
    }
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        System.out.print("�� ���� ��ǥ�� �Է��ϼ��� (x1 y1 x2 y2) >> ");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        
        if(inRect(x1,y1,100,100,200,200)||inRect(x2,y2,100,100,200,200))
            System.out.print("(100,100), (200,200)���� �̷���� ���簢���� �浹�մϴ�.");
        else if(inRect(100,100,x1,y1,x2,y2)||inRect(200,200,x1,y1,x2,y2))
            System.out.print("(100,100), (200,200)���� �̷���� ���簢���� �浹�մϴ�.");
        else
            System.out.print("(100,100), (200,200)���� �̷���� ���簢���� �浹���� �ʽ��ϴ�.");
            
        scanner.close();
	}
}
