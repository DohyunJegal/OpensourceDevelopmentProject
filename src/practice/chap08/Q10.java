package practice.chap08;
import java.io.*;
import java.util.*;

public class Q10 {
	public static void main(String[] args) {
		Scanner scanner;

		try {
			HashMap<String, String> phone = new HashMap<String, String>();
			File file = new File("c:\\temp\\phone.txt");
			FileReader fr = new FileReader(file);
			scanner = new Scanner(fr);

			while (scanner.hasNext()) {
				String name = scanner.next();
				String tel = scanner.next();
				phone.put(name, tel);
			}
			
			System.out.println("�� " + phone.size() + "���� ������ �о����ϴ�.");
			scanner.close();
			
			scanner = new Scanner(System.in);
			
			while (true) {
				System.out.print("�̸� >> ");
				String temp = scanner.next();
				
				if (temp.equals("�׸�")) {
					break;
				}
				
				String tel = phone.get(temp);
				
				if (tel == null) {
					System.out.println("ã�� �̸��� �����ϴ�.");
				} else {
					System.out.println(tel);
				}
			}
			scanner.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
