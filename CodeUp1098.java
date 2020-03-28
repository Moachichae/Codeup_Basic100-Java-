package basicProblem100.solving02;

import java.util.Scanner;

public class CodeUp1098 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt(); // 세로
		int w = sc.nextInt(); // 가로
		
		int[][] board = new int[h+1][w+1];
		for(int i = 1; i <= h; i++) {
			for(int j = 1; j <= w; j++) {
				board[i][j]=0;				
			}
		}
		
		int n = sc.nextInt(); // 막대의 개수
		int[][] stick = new int[n][4];
		for(int i = 0; i<n; i++) {
			 stick[i][0] = sc.nextInt(); // 막대의 길이
			 stick[i][1] = sc.nextInt(); // 막대의 방향 가로 = 0, 세로 = 1
			 stick[i][2] = sc.nextInt(); // x좌표
			 stick[i][3] = sc.nextInt(); //	y좌표		
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
