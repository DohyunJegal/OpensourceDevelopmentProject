package practice.chap03;
import java.util.Scanner;

public class Q14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        String course [] = {"Java", "C++", "HTML5", "��ǻ�ͱ���", "�ȵ���̵�"};
        int score [] = {95, 88, 76, 62, 55};
        int i = 0;
        
        for(;;){
        	System.out.print("���� �̸� >> ");
        	String name = scanner.next();
        	
            if(name.equals("�׸�"))
                break;
            else{
                for(i=0; i<5; i++){
                    if(course[i].equals(name)) {
                        System.out.println(course[i]+"�� ������ "+score[i]);  
                    	break;
                    }
                    	
                    if(i == 4)
                    	System.out.println("���� �����Դϴ�.");
                }
            }   
        }
        
        scanner.close();
	}
}
