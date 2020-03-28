package basicProblem100.solving01;

import java.util.Scanner;

public class CodeUp1035 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String HexNumber = sc.next();
		int decimalNumber = Integer.parseInt(HexNumber, 16);
		String octalNumber = Integer.toOctalString(decimalNumber);
		System.out.println(octalNumber);
		sc.close();
	} // end main()

} // end CodeUp1035
