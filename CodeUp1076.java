package basicProblem100.solving02;

import java.util.Scanner;

public class CodeUp1076 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char x = sc.nextLine().charAt(0);
		for(char i = 'a'; i <= x; i++) {
			System.out.println(i);
			if(x > 'z') {
				break;
			}
		}
		sc.close();
	} // end main()

} // end CodeUp1076
