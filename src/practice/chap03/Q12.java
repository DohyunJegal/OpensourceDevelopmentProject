package practice.chap03;

public class Q2 {
	public static void main(String[] args) {
		int n[][] = {{1},{1,2,3},{1},{1,2,3,4},{1,2}};
		
		for(int i[] : n){
			for (int j : i)
	            System.out.print(j + " ");
	        System.out.println("");
		}
			
		System.out.println("");
	}
}
