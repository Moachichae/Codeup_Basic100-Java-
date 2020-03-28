package basicProblem100.solving02;

import java.util.Scanner;

public class CodeUp1096 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] b = new int[20][20];
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			b[sc.nextInt()][sc.nextInt()] = 1;
		}

		for (int i = 1; i < b.length; i++) {
			for (int j = 1; j < b[0].length; j++) {
				System.out.printf("%d ",b[i][j]);
			}
			System.out.println();
		}

		sc.close();
	} // end main()

} // end CodeUp1096
