package practice.chap03;
import java.util.Scanner;
import java.util.Random;

public class Q8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int array_num;
		
		do {
			System.out.print("정수의 개수 (100보다 작은 수) >> ");
			array_num = scanner.nextInt();
		} while (array_num<1||array_num>=100);
		
		int array[] = new int[array_num];
		
		for(int i=0; i<array_num; i++) {
			array[i] = random.nextInt(99)+1;
		
			for(int j=0; j<i;j++) {
				if(array[i]==array[j])
					i--;
			}
		}
		
		for(int k=0; k<array_num; k++) {
			if (k%10 == 0 && k!=0)
				System.out.println();
			
			System.out.print(array[k]+" ");
		}
		
		scanner.close();
	}
}
