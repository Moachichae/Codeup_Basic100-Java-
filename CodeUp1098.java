package basicProblem100.solving02;

import java.util.Scanner;

public class CodeUp1098 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt(); // ����
		int w = sc.nextInt(); // ����
		
		int[][] board = new int[h+1][w+1];
		for(int i = 1; i <= h; i++) {
			for(int j = 1; j <= w; j++) {
				board[i][j]=0;				
			}
		}
		
		int n = sc.nextInt(); // ������ ����
		int[][] stick = new int[n][4];
		for(int i = 0; i<n; i++) {
			 stick[i][0] = sc.nextInt(); // ������ ����
			 stick[i][1] = sc.nextInt(); // ������ ���� ���� = 0, ���� = 1
			 stick[i][2] = sc.nextInt(); // x��ǥ
			 stick[i][3] = sc.nextInt(); //	y��ǥ		
		}
		
		for(int i = 0; i < n; i++) {			
			if(stick[i][1] == 0) {
				for(int l = 0; l < stick[i][0]; l++) {
					board[stick[i][2]][stick[i][3]+l] = 1;
				}
			} else {
				for(int l = 0; l < stick[i][0]; l++) {
					board[stick[i][2]+l][stick[i][3]] = 1;
			}
		}
		}
		
			for(int i = 1; i <= h; i++) {
				for(int j = 1; j <= w; j++) {
					System.out.printf("%d ",board[i][j]);				
				}
				System.out.println();
			}
		
		
		
		sc.close();
	} // end main()

} // end CodeUp1098
