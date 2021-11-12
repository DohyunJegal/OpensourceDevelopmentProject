package practice.chap08;
import java.io.*;

public class Q2 {
	public static void main(String[] args) {
		BufferedReader fr = null;
		File file = new File("c:\\Temp\\phone.txt");
		
		try {
			fr = new BufferedReader(new FileReader(file));
			System.out.println(file.getPath() + "를 출력합니다.");
			
			while (true) {
				String line = fr.readLine();
				
				if (line == null) 
					break;
				
				System.out.print(line + "\n");
			}
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}