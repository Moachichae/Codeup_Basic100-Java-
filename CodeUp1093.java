package basicProblem100.solving02;

import java.util.Scanner;

public class CodeUp1093 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] number = new int[n];
		for(int i = 0; i < number.length; i++) {
			number[i] = sc.nextInt();
		}
		
		for(int i = 1; i <= 23; i++) {
			int x = 0;
			for(int j = 0; j < n;j++) {
				if(i == number[j]) {
					x++;
				}
			}
			System.out.printf("%d ",x);
		}
		sc.close();
	} // end main()

} // end CodeUp1093