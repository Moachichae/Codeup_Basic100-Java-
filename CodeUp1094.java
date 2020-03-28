package basicProblem100.solving02;

import java.util.Scanner;

public class CodeUp1094 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] number = new int[n];
		for(int i = 0; i < number.length; i++) {
			number[i] = sc.nextInt();
		}
		for(int i = n-1; i >= 0; i--) {
			System.out.printf("%d ",number[i]);
		}
		sc.close();
	} // end main()

} // end CodeUp1094
