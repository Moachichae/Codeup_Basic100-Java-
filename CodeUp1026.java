package basicProblem100.solving01;

import java.util.Scanner;

public class CodeUp1026 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String output = sc.nextLine();
		String[] time = output.split(":",3);
		System.out.println(Integer.parseInt(time[1]));
		
		sc.close();
	} // end main()

} // end CodeUp1026
