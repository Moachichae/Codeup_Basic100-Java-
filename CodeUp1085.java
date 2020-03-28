package basicProblem100.solving02;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class CodeUp1085 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		h(Hz) * b(비트) * c (채널) * s (녹음할 시간)  bit

		int h = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int s = sc.nextInt();

		BigInteger bh = new BigInteger(Integer.toString(h));
		BigInteger bb = new BigInteger(Integer.toString(b));
		BigInteger bc = new BigInteger(Integer.toString(c));
		BigInteger bs = new BigInteger(Integer.toString(s));
		
		BigInteger b8 = new BigInteger(Integer.toString(8));
		BigDecimal d8 = new BigDecimal(b8);
		BigInteger bMb = new BigInteger(Integer.toString(1024*1024));
		BigDecimal dMb = new BigDecimal(bMb);
		
		
		BigInteger byteSpace = bh.multiply(bb).multiply(bc).multiply(bs);
		BigDecimal mbSpace = new BigDecimal(byteSpace);		
		
		
		System.out.printf("%.1f",mbSpace.divide(d8).divide(dMb));
		
		System.out.println(" MB");
		
		sc.close();
	} // end main()

} // end CodeUp1085
