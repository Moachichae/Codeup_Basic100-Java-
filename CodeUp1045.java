package basicProblem100.solving01;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.util.Scanner;

public class CodeUp1045 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		BigInteger bigNumber1 = BigInteger.valueOf(number1);
		BigInteger bigNumber2 = BigInteger.valueOf(number2);
		BigDecimal decNumber1 = BigDecimal.valueOf(number1);
		BigDecimal decNumber2 = BigDecimal.valueOf(number2);
		
		System.out.println(bigNumber1.add(bigNumber2));
		System.out.println(bigNumber1.subtract(bigNumber2));
		System.out.println(bigNumber1.multiply(bigNumber2));
		System.out.println(bigNumber1.divide(bigNumber2));
		System.out.println(bigNumber1.mod(bigNumber2));
		System.out.printf("%.2f", decNumber1.divide(decNumber2,MathContext.DECIMAL32));
	
		
		
		
		
		sc.close();
	} // end main()

} // end CodeUp1045