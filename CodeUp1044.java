package basicProblem100.solving01;

import java.math.BigInteger;
import java.util.Scanner;

public class CodeUp1044 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String x = sc.next();
		BigInteger bigX = new BigInteger(x);		
		System.out.println(bigX.add(new BigInteger("1")));
		
		System.out.println("====================================");
		
		System.out.println(bigX.add(BigInteger.valueOf(1)));
		
		sc.close();
	} // end main()

} // end CodeUp1044
