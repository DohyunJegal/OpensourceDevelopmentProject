package practice.chap08;
import java.io.*;
import java.util.Scanner;

public class Q4 {
	public static void main(String[] args) {
		System.out.println("c:\\windows\\system.ini 파일을 읽어 출력합니다.");
		
		try {
			Scanner fscanner = new Scanner(new FileReader("c:\\windows\\system.ini"));
			int lineNumber = 1;
			
			while (fscanner.hasNext()) {
				String line = fscanner.nextLine();
				System.out.printf("%4d", lineNumber++);
				System.out.println(": " + line);
			}
			fscanner.close();
		} catch (IOException e) {
			System.out.println("입출력 오류가 발생했습니다.");
		}
	}
}