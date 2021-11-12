package practice.chap08;
import java.io.*;
import java.util.*;

public class Q14 {
	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(System.in);
			File file = new File("c:\\");
			System.out.println("***** ���� Ž�����Դϴ�. *****");
			while (true) {
				String currentDir = file.getPath();
				System.out.println("[" + currentDir + "]");
				File [] fileList = file.listFiles();
				
				for (int i = 0; i < fileList.length; i++) {
					String dir;
					
					if (fileList[i].isDirectory())
						dir = "dir";
					else
						dir = "file";

					System.out.println(dir + "\t" + fileList[i].length() + "����Ʈ\t" + fileList[i].getName());
				}
				
				System.out.print(">>");
				String line = scanner.nextLine();
				StringTokenizer st = new StringTokenizer(line, " ");
				String op = st.nextToken();

				if (op.equals("�׸�"))
					break;

				if (op.equals("..")) {
					if (file.getParent() == null)
						continue;
					else {
						file = new File(file.getParent());
					}
				} else {
					if (op.equals("rename")) {
						try {
							String v1 = st.nextToken();
							String v2 = st.nextToken();
							File on = new File(file, v1);
							File rn = new File(file, v2);
							if (rn.exists()) {
								System.out.println("�̹� �����ϴ� �����̳� ���͸� �̸��Դϴ�.");
							} else {
								on.renameTo(rn);
							}

						} catch (Exception e) {
							System.out.println("�ΰ��� ���ϸ��� �־����� �ʾҽ��ϴ�.");
						}
					} else if (op.equals("mkdir")) {
						try {
							String dirName = st.nextToken();
							File newDir = new File(file, dirName);
							if (newDir.exists())
								System.out.println("�̹� �����ϴ� �����̳� ���丮�Դϴ�.");
							else {
								System.out.println(dirName + " ���͸��� �����Ͽ����ϴ�.");
								newDir.mkdir();
							}
						} catch (Exception e) {
							System.out.println("������ ���丮 ���� �־����� �ʾҽ��ϴ�.");
						}
					} else {
						if (new File(file, op).isDirectory()) {
							file = new File(file, op);
						} else {
							System.out.println("���丮�� �ƴմϴ�.");
						}
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
