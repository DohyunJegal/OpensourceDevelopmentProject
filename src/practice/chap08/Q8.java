package practice.chap08;
import java.io.*;

public class Q8 {
	public static void main(String[] args) {
		File file = new File("c:\\");
		File [] list = file.listFiles();
		long max = -1;
		int max_i = -1;
		
		for(int i = 0; i < list.length; i++) {
			if(max < list[i].length()) {
				max = list[i].length();
				max_i = i;
			}
		}
		System.out.println("가장 큰 파일은 " + list[max_i].getPath() + ", " + list[max_i].length() + "바이트");
	}
}