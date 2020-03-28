package basicProblem100.solving02;

import java.util.Scanner;

public class CodeUp1075 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		x -= 1;
		if(x <= 100) {
			while(x>0) {
				System.out.println(x);
				x--;
			}
		}
		sc.close();
	} // end main()

} // end CodeUp1075
