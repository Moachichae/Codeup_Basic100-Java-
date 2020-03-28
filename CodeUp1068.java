package basicProblem100.solving02;

import java.util.Scanner;

public class CodeUp1068 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
		
		if (0 <= a && a <=100 ) {
			
			if(a>=90 && a<=100) {
				System.out.println("A");
			} else if (a>=70 && a<=89){
				System.out.println("B");
			} else if (a>=40 && a<=69){
				System.out.println("C");
			} else {
				System.out.println("D");
			}
			
		} 
		else {
			System.out.println("error");
		} 
		sc.close();
	} // end main()

} // end CodeUp1068
