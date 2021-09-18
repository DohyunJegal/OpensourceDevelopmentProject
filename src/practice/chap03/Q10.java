package practice.chap03;
import java.util.Random;

public class Q10 {

	public static void main(String[] args) {
		Random random = new Random();
        int array[][] = new int[4][4];
        
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++)
                array[i][j] = 0;
        }
        
        for(int k=0; k<10; k++){
            int x=random.nextInt(4);
            int y=random.nextInt(4);
            
            if(array[x][y]!=0){
                k--;
                continue;
            } else
                array[x][y] = random.nextInt(10)+1;
        }    
        
        for(int l=0; l<4; l++){
            for(int m=0; m<4; m++){
                System.out.print(array[l][m]+" ");
            }
            System.out.println();
        }
	}
}
