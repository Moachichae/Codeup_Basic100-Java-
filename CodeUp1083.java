package basicProblem100.solving02;

import java.util.Scanner;


public class CodeUp1083 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		for(int i = 1; i <= x; i++) {
			if (i%3==0) {
				System.out.println("X");
			} else {
				System.out.println(i);
			}
		}
		sc.close();
	} // end main()

} // end CodeUp1083
