package basicProblem100.solving02;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class CodeUp1086 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int g = sc.nextInt();
		int b = sc.nextInt();
	

		BigInteger bh = new BigInteger(Integer.toString(r));
		BigInteger bb = new BigInteger(Integer.toString(g));
		BigInteger bc = new BigInteger(Integer.toString(b));
		
		
		BigInteger b8 = new BigInteger(Integer.toString(8));
		BigDecimal d8 = new BigDecimal(b8);
		BigInteger bMb = new BigInteger(Integer.toString(1024*1024));
		BigDecimal dMb = new BigDecimal(bMb);
		
		
		BigInteger byteSize = bh.multiply(bb).multiply(bc);
		BigDecimal mbSpace = new BigDecimal(byteSize);		
		
		
		System.out.printf("%.2f %S",mbSpace.divide(d8).divide(dMb),"MB");
		
			
		sc.close();
	} // end main()

} // end CodeUp1086
