package practice.chap08;
import java.io.*;
import java.util.*;

public class Q12 {
	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("��ü ��θ��� �ƴ� ���� �̸��� �Է��ϴ� ���, ������ ������Ʈ ������ �־�� �մϴ�.");
			System.out.print("��� ���ϸ� �Է� >> ");
			String fileName = scanner.next();

			FileReader fr = new FileReader(new File(fileName));
			Vector<String> v = new Vector<String>();
			Scanner fscanner = new Scanner(fr);

			while (fscanner.hasNext()) {
				String line = fscanner.nextLine();
				v.add(line);
			}

			while (true) {
				System.out.print("�˻��� �ܾ ���� >> ");
				String findName = scanner.next();
				boolean find = false;
				
				if (findName.equals("�׸�"))
					break;
				
				for (int i = 0; i < v.size(); i++) {
					String temp = v.get(i);
					
					if (temp.indexOf(findName) != -1) {
						find = true;
						System.out.println(i + ": " + temp);
					}
				}
				
				if (!find)
					System.out.println("�Է°��� �����ϴ�.");
			}
			System.out.println("���α׷��� �����մϴ�.");
			scanner.close();
			fscanner.close();
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}