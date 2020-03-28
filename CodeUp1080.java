package basicProblem100.solving02;

import java.util.Scanner;

public class CodeUp1080 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = 0;
		int z = 0;
		while (true) {
			y += z;

			if (y >= x) {
				System.out.println(z);
				break;
			}

			z++;
		}

		sc.close();
	} // end main()

} // end CodeUp1080
