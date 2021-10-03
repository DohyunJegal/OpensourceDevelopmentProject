package practice.chap04;
import java.util.Scanner;

class Dictionary {
	private static String[] kor = {"���", "�Ʊ�", "��", "�̷�", "���"};
	private static String[] eng = {"love", "baby", "money", "future", "hope"};
	
	public static void kor2Eng(String word) {
		boolean status = false;
		
		for(int i = 0; i<5; i++) {
			if(kor[i].equals(word)) {
				System.out.println(word + "�� " + eng[i]);
				status = true;
			}
		}
		
		if(!status)
			System.out.println(word + "�� ���� ������ �����ϴ�.");
	}
}

public class Q10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Dictionary dic = new Dictionary();
		
		System.out.println("�ѿ� �ܾ� �˻� ���α׷��Դϴ�.");
		
		while(true) {
			System.out.print("�ѱ� �ܾ�? >> ");
			String word = scanner.next();
			
			if(word.equals("�׸�"))
				break;
			
			dic.kor2Eng(word);
		}
	}
}
