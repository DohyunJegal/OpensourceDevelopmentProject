package practice.chap03;
import java.util.Scanner;

public class Q16 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        String str[] = {"����", "����", "��"};
        String input;
        
        System.out.println("��ǻ�Ϳ� ���� ���� �� ������ �մϴ�.");
        
        
        for(;;) {
        	System.out.print("���� ���� ��! >> ");
        	input = scanner.next();
        	int n = (int)(Math.random()*3);
        	
        	if(input.equals("�׸�")) {
        		System.out.println("������ �����մϴ�...");
        		break;
        	}
        	else if(input.equals(str[n]))
        		System.out.println("����� = "+input+", ��ǻ�� = "+str[n]+", �����ϴ�.");
        	else if(input.equals("����")) {
        		if(n==1)
        			System.out.println("����� = "+input+", ��ǻ�� = "+str[n]+", ��ǻ�Ͱ� �̰���ϴ�.");
        		else
        			System.out.println("����� = "+input+", ��ǻ�� = "+str[n]+", ����ڰ� �̰���ϴ�.");
        	}
        	else if(input.equals("����")) {
        		if(n==2)
        			System.out.println("����� = "+input+", ��ǻ�� = "+str[n]+", ��ǻ�Ͱ� �̰���ϴ�.");
        		else
        			System.out.println("����� = "+input+", ��ǻ�� = "+str[n]+", ����ڰ� �̰���ϴ�.");
        	}
        	else if(input.equals("��")) {
        		if(n==0)
        			System.out.println("����� = "+input+", ��ǻ�� = "+str[n]+", ��ǻ�Ͱ� �̰���ϴ�.");
        		else
        			System.out.println("����� = "+input+", ��ǻ�� = "+str[n]+", ����ڰ� �̰���ϴ�.");
        	}
        	else
        		System.out.println("�ٽ� �Է��ϼ���");
        }
        
        scanner.close();
	}
}
