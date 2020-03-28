package basicProblem100.solving01;


import java.util.Scanner;

public class CodeUp1046 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] number = sc.nextLine().split(" ");
		int sum = 0;
		for(int i = 0; i < number.length; i++) {
			sum = sum + Integer.parseInt(number[i]);
		}
		System.out.println(sum);
		
		double average = Math.round(sum /(double) number.length * 10) / 10.0;
		
		System.out.println(average);
		
		sc.close();
	} // end main()

} // end CodeUp1046
