package practice.chap03;
import java.util.Scanner;

public class Q16 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        String str[] = {"가위", "바위", "보"};
        String input;
        
        System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
        
        
        for(;;) {
        	System.out.print("가위 바위 보! >> ");
        	input = scanner.next();
        	int n = (int)(Math.random()*3);
        	
        	if(input.equals("그만")) {
        		System.out.println("게임을 종료합니다...");
        		break;
        	}
        	else if(input.equals(str[n]))
        		System.out.println("사용자 = "+input+", 컴퓨터 = "+str[n]+", 비겼습니다.");
        	else if(input.equals("가위")) {
        		if(n==1)
        			System.out.println("사용자 = "+input+", 컴퓨터 = "+str[n]+", 컴퓨터가 이겼습니다.");
        		else
        			System.out.println("사용자 = "+input+", 컴퓨터 = "+str[n]+", 사용자가 이겼습니다.");
        	}
        	else if(input.equals("바위")) {
        		if(n==2)
        			System.out.println("사용자 = "+input+", 컴퓨터 = "+str[n]+", 컴퓨터가 이겼습니다.");
        		else
        			System.out.println("사용자 = "+input+", 컴퓨터 = "+str[n]+", 사용자가 이겼습니다.");
        	}
        	else if(input.equals("보")) {
        		if(n==0)
        			System.out.println("사용자 = "+input+", 컴퓨터 = "+str[n]+", 컴퓨터가 이겼습니다.");
        		else
        			System.out.println("사용자 = "+input+", 컴퓨터 = "+str[n]+", 사용자가 이겼습니다.");
        	}
        	else
        		System.out.println("다시 입력하세요");
        }
        
        scanner.close();
	}
}
