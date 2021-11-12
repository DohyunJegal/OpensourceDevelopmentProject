package practice.chap08;
import java.io.*;
import java.util.*;

public class Q12 {
	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다.");
			System.out.print("대상 파일명 입력 >> ");
			String fileName = scanner.next();

			FileReader fr = new FileReader(new File(fileName));
			Vector<String> v = new Vector<String>();
			Scanner fscanner = new Scanner(fr);

			while (fscanner.hasNext()) {
				String line = fscanner.nextLine();
				v.add(line);
			}

			while (true) {
				System.out.print("검색할 단어나 문장 >> ");
				String findName = scanner.next();
				boolean find = false;
				
				if (findName.equals("그만"))
					break;
				
				for (int i = 0; i < v.size(); i++) {
					String temp = v.get(i);
					
					if (temp.indexOf(findName) != -1) {
						find = true;
						System.out.println(i + ": " + temp);
					}
				}
				
				if (!find)
					System.out.println("입력값이 없습니다.");
			}
			System.out.println("프로그램을 종료합니다.");
			scanner.close();
			fscanner.close();
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}