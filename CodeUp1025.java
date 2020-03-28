package basicProblem100.solving01;

import java.util.Scanner;

public class CodeUp1025 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String x = sc.next();
		for(int i = 0; i < x.length(); i++) {
			String numString = String.valueOf(x.charAt(i));
			System.out.print("[" + numString);
			for(int v = 1+i; v < x.length(); v++) {
				System.out.print("0");
			}
			System.out.println("]");			
		}
		System.out.println("============================");
		
		for(int i = 0; i < x.length(); i++) {
			System.out.println("[" + Integer.parseInt(String.valueOf(x.charAt(i))) * 
					(int) Math.pow(10, x.length()-(i+1))+ "]");
		}
		
		
		
		
		
		sc.close();
	} // end main()

} // end CodeUp1025
