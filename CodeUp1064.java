package basicProblem100.solving02;

import java.util.Scanner;

public class CodeUp1064 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int result = (a < b ? a : b) < c ? (a < b ? a : b) : c;
		System.out.println(result);
		sc.close();
	} // end main()

} // end CodeUp1064
