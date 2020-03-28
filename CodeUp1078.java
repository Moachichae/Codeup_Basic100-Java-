package basicProblem100.solving02;

import java.util.Scanner;

public class CodeUp1078 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = 0;
		for(int i = 0; i <= x; i++) {
			if(i%2 == 0) {
				y += i;
			}
		}
		System.out.println(y);
		sc.close();
	} // end main()

} // end CodeUp1078
