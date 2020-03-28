package basicProblem100.solving02;

import java.util.Scanner;

public class CodeUp1058 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a == 0 && a == b) {
			System.out.println(1);
		}else {
			System.out.println(0);
		}				
		sc.close();
	} // end main()

} // end CodeUp1058
