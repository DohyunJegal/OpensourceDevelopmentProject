package practice.chap04;
import java.util.Scanner;

class Dictionary {
	private static String[] kor = {"사랑", "아기", "돈", "미래", "희망"};
	private static String[] eng = {"love", "baby", "money", "future", "hope"};
	
	public static void kor2Eng(String word) {
		boolean status = false;
		
		for(int i = 0; i<5; i++) {
			if(kor[i].equals(word)) {
				System.out.println(word + "은 " + eng[i]);
				status = true;
			}
		}
		
		if(!status)
			System.out.println(word + "는 저의 사전에 없습니다.");
	}
}

public class Q10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Dictionary dic = new Dictionary();
		
		System.out.println("한영 단어 검색 프로그램입니다.");
		
		while(true) {
			System.out.print("한글 단어? >> ");
			String word = scanner.next();
			
			if(word.equals("그만"))
				break;
			
			dic.kor2Eng(word);
		}
	}
}
