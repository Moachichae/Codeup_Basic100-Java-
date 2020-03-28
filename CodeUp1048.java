package basicProblem100.solving01;

import java.util.Scanner;

public class CodeUp1048 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] number = sc.nextLine().split(" ");
		int squared = (int)Math.pow(2, Double.parseDouble(number[1]));
		System.out.println(Integer.parseInt(number[0]) * squared);
		sc.close();
	} // end main()

} // end CodeUp1048
