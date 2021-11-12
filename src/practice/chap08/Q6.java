package practice.chap08;
import java.io.*;
import java.util.Scanner;

public class Q6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("��ü ��θ��� �ƴ� ���� �̸��� �Է��ϴ� ���, ������ ������Ʈ ������ �־�� �մϴ�.");
		
		System.out.print("ù��° ���� �̸��� �Է��ϼ��� >> ");
		String s1 = scanner.next();
		System.out.print("�ι�° ���� �̸��� �Է��ϼ��� >> ");
		String s2 = scanner.next();
		
		try {
			FileInputStream f1 = new FileInputStream(s1);
			FileInputStream f2 = new FileInputStream(s2);
			FileOutputStream f3 = new FileOutputStream(new File("appended.txt"));

			byte[] buff = new byte[1024];
			
			while (true) {
				int temp = f1.read(buff);
				f3.write(buff, 0, buff.length);
				if (temp < buff.length)
					break;
			}
			
			while (true) {
				int temp = f2.read(buff);
				f3.write(buff, 0, buff.length);
				if (temp < buff.length)
					break;
			}

			System.out.println("������Ʈ ���� �ؿ� appended.txt ���Ͽ� �����߽��ϴ�.");
			f1.close();
			f2.close();
			f3.close();

			scanner.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}