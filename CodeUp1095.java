package basicProblem100.solving02;

import java.util.Scanner;

public class CodeUp1095 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] number = new int[n];
		for(int i = 0; i < number.length; i++) {
			number[i] = sc.nextInt();
		}
		int x = number[0];
		for(int i = 0; i < n; i++) {
			if(x > number[i]) {
				x = number[i];
			}
			
		}
		System.out.println(x);
		sc.close();
	} // end main()

} // end CodeUp1095
