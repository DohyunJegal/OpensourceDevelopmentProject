package practice.chap04;
import java.util.Scanner;

class Phone{
	private String name;
	private String number;
	
	public Phone(String name, String number){
		this.name = name;
		this.number = number;
	}
	public String Name() {
		return name;
	}
	public String Number() {
		return number;
	}
}

public class Q8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name, number, search;
		Phone phone[];

		System.out.print("인원수 >> ");
		int person = scanner.nextInt();
		phone = new Phone[person];
		
		for(int i = 0; i < person;i++) {
			System.out.print("이름과 전화번호 (이름과 번호는 빈 칸없이 입력) >> ");
			name = scanner.next();
			number = scanner.next();
			phone[i] = new Phone(name, number);
		}
		System.out.println("저장되었습니다... ");
		
		while(true) {
			boolean status = false;
			
			System.out.print("검색할 이름 >> ");
			search = scanner.next();
			
			if(search.equals("그만"))
				break;
			
			for(int j = 0; j < person; j++ ) {
				if(search.equals(phone[j].Name())) {
					System.out.println(search + "의 번호는 " + phone[j].Number() + "입니다.");
					status = true;
				}	
			}
			
			if(!status) System.out.println(search + " 이 없습니다.");
		}
	}

}
