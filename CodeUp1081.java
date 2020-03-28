package basicProblem100.solving02;

import java.util.Scanner;

public class CodeUp1081 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int i,j;				
		for(i = 1; i <= n; i++) {
			for(j = 1; j <= m; j++) {
				System.out.println(i + " " + j);
			}
		}
		sc.close();
	} // end main()

} // end CodeUp1081
