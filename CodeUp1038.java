package basicProblem100.solving01;

import java.math.BigInteger;
import java.util.Scanner;

public class CodeUp1038 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String outNumber1 = sc.next();
		String outNumber2 = sc.next();
		
		BigInteger number1 = new BigInteger(outNumber1);
		BigInteger number2 = new BigInteger(outNumber2);
		
		System.out.println(number1.add(number2));
		sc.close();
	} // end main()

} // end CodeUp1038
