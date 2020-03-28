package basicProblem100.solving02;

import java.util.Scanner;

public class CodeUp1072 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(; 0 < n; n--) {
			System.out.println(sc.nextInt());
		}
		System.out.println("================================");
		
		while(n > 0) {
			System.out.println(sc.nextInt());
			n--;
		}
		
		sc.close();
	} // end main()

} // end CodeUp1070
