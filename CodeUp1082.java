package basicProblem100.solving02;

import java.util.Scanner;

public class CodeUp1082 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String hexString = sc.next();
		int decimal = Integer.parseInt(hexString, 16);
		for(int i = 1; i < 16; i++) {						
			hexString = String.format("%X", decimal);
			String hexI = String.format("%X", i);
			System.out.print(hexString + "*" + hexI + "=");
			System.out.printf("%X%n",(decimal*i));
		}
		sc.close();
	} // end main()

} // end CodeUp1082
