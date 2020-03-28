package basicProblem100.solving01;

import java.util.Scanner;

public class CodeUp1020 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] x = sc.nextLine().split("-",2);
		int frontNumber = Integer.parseInt(x[0]);
		int backNumber = Integer.parseInt(x[1]);
		System.out.printf("%06d%07d", frontNumber,backNumber);
		
		sc.close();
	} // end main()

} // end CodeUp1020
