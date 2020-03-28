package basicProblem100.solving02;

import java.util.Scanner;

public class CodeUp1090 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextInt();
		int d = sc.nextInt();
		int n = sc.nextInt();
		
		for(int i = 1; i<= n; i++) {			
			if(i==n) {
				System.out.println(a);
			}
			a = a * d;			
		}

		sc.close();
	} // end main()

} // end CodeUp1090