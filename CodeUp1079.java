package basicProblem100.solving02;

import java.util.Scanner;

public class CodeUp1079 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			char x = sc.next().charAt(0); // nextLine()�� codeUp���� �����߻�
			System.out.println(x);
			if(x == 'q') {
				break;
			}
		}
		sc.close();
	} // end main()

} // end CodeUp1079
