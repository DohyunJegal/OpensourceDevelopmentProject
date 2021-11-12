package practice.chap08;
import java.io.*;
import java.util.*;

public class Q14 {
	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(System.in);
			File file = new File("c:\\");
			System.out.println("***** 파일 탐색기입니다. *****");
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

					System.out.println(dir + "\t" + fileList[i].length() + "바이트\t" + fileList[i].getName());
				}
				
				System.out.print(">>");
				String line = scanner.nextLine();
				StringTokenizer st = new StringTokenizer(line, " ");
				String op = st.nextToken();

				if (op.equals("그만"))
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
								System.out.println("이미 존재하는 파일이나 디렉터리 이름입니다.");
							} else {
								on.renameTo(rn);
							}

						} catch (Exception e) {
							System.out.println("두개의 파일명이 주어지지 않았습니다.");
						}
					} else if (op.equals("mkdir")) {
						try {
							String dirName = st.nextToken();
							File newDir = new File(file, dirName);
							if (newDir.exists())
								System.out.println("이미 존재하는 파일이나 디렉토리입니다.");
							else {
								System.out.println(dirName + " 디렉터리를 생성하였습니다.");
								newDir.mkdir();
							}
						} catch (Exception e) {
							System.out.println("생성할 디렉토리 명이 주어지지 않았습니다.");
						}
					} else {
						if (new File(file, op).isDirectory()) {
							file = new File(file, op);
						} else {
							System.out.println("디렉토리가 아닙니다.");
						}
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
