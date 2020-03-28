package basicProblem100.solving02;

import java.util.Scanner;

public class CodeUp1097 {
	public static void main(String[] args) {
		int[][] stone = new int[20][20];
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i < stone.length; i++) {
			for (int j = 1; j < stone[0].length; j++) {
				stone[i][j]=sc.nextInt();
			}			
		}	
		
		int n = sc.nextInt();
		int[][] point = new int[n][2];
		for(int i = 0; i < n; i++) { // i.0 = x ÁÂÇ¥ , i.1 = y ÁÂÇ¥
			point[i][0] = sc.nextInt();
			point[i][1] = sc.nextInt();
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < stone[0].length; j++) {
				stone[point[i][0]][j] = stone[point[i][0]][j] == 0 ? 1 : 0;
				stone[j][point[i][1]] = stone[j][point[i][1]] == 0 ? 1 : 0;
			}			
		}
		
		
		for (int i = 1; i < stone.length; i++) {
			for (int j = 1; j < stone[1].length; j++) {
				System.out.printf("%d ",stone[i][j]);
			}
			System.out.println();
		}
		
		
		sc.close();
	} // end main()

} // end CodeUp1097
