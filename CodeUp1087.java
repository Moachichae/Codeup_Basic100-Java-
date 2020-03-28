package basicProblem100.solving02;

import java.util.Scanner;

public class CodeUp1087 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = 0;
		int i = 0;
		while(true) {			
			x = x + i;
			if(x >= n) {
				System.out.println(x);
				break;
			}
			i++;
		}
		
		sc.close();
	} // end main()

} // end CodeUp1087
