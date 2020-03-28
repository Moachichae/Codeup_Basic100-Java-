package basicProblem100.solving01;

import java.util.Scanner;

public class CodeUp1024 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String x = sc.next();
		for(int i = 0; i <  x.length(); i++) {
			char a = x.charAt(i);
			System.out.println("'" + a + "'");
		}
		sc.close();
	} // end main()

} // end CodeUp1024
