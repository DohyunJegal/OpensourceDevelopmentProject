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

		System.out.print("�ο��� >> ");
		int person = scanner.nextInt();
		phone = new Phone[person];
		
		for(int i = 0; i < person;i++) {
			System.out.print("�̸��� ��ȭ��ȣ (�̸��� ��ȣ�� �� ĭ���� �Է�) >> ");
			name = scanner.next();
			number = scanner.next();
			phone[i] = new Phone(name, number);
		}
		System.out.println("����Ǿ����ϴ�... ");
		
		while(true) {
			boolean status = false;
			
			System.out.print("�˻��� �̸� >> ");
			search = scanner.next();
			
			if(search.equals("�׸�"))
				break;
			
			for(int j = 0; j < person; j++ ) {
				if(search.equals(phone[j].Name())) {
					System.out.println(search + "�� ��ȣ�� " + phone[j].Number() + "�Դϴ�.");
					status = true;
				}	
			}
			
			if(!status) System.out.println(search + " �� �����ϴ�.");
		}
	}

}
