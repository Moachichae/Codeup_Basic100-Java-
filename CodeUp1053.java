package basicProblem100.solving02;

import java.util.Scanner;

public class CodeUp1053 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		if(x == 1) {
			System.out.println(0);
		}else {
			System.out.println(1);
		}
		
		System.out.println("=================");
		
		System.out.println(x == 1 ? 0:1);
		
		
		sc.close();
	} // end main()

} // end CodeUp1053
