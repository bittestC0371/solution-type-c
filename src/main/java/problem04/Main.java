package problem04;
import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		
		int[][] gugudan = new int[10][10];
		// 랜덤문제의 답을 담을 배열
		int[] randoms = new int[18];
		// 랜덤 문제의 문제를 담을 배열
		String[] ranQ = new String[18];
		
		int ran1;
		int ran2;
		
		int cntSuc = 0;
		int cntFail = 18 - cntSuc;
		
		// 구구단 생성
		for(int i = 1; i < gugudan.length; i++) {
			for(int j = 1; j < gugudan[i].length; j++) {
				gugudan[i][j] = i*j;
			}
		}
		
		// 각 단에서 2개씩 문제 18개 랜덤으로 고르기
			int i = 0;
			for (int j = 1; j < 10; j++) {	
				ran1 = random.nextInt(10);
				ran2 = random.nextInt(10);
				ranQ[i] = j+"*"+ran1;
				ranQ[i+1] = j+"*"+ran2;
				randoms[i] = gugudan[j][ran1];
				randoms[i+1] = gugudan[j][ran2];
				i += 2;
			}
			
			// 랜덤 문제들 출력
			for(int k = 0; k < ranQ.length; k++) {
				System.out.print(ranQ[k] + " ");
			}
			// 문제 랜덤으로 출력
			for(int k = 0; k < ranQ.length; k++) {
				int ran3 = random.nextInt(18);
				System.out.println(ranQ[ran3]);
			}
			
	
		
		
	}
}