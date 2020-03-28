package basicProblem100.solving02;

import java.util.Scanner;


public class CodeUp1099 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[][] anthill = new int[11][11];
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				anthill[i][j] = sc.nextInt();
			}
		}

		Ant ant = new Ant(2, 2);

		while (ant.eat) {
			if (ant.getY() == 11) {
				ant.setY(10);
				if (anthill[ant.getX() + 1][ant.getY()] != 1 & ant.getX() < 10) {
					ant.setX(ant.getX() + 1);
				}
			}
			if (ant.getX() == 11) {
				ant.setX(10);
				if (anthill[ant.getX()][ant.getY() + 1] != 1 & ant.getY() < 10) {
					ant.setY(ant.getY() + 1);
				}
			}

			if (anthill[ant.getX()][ant.getY()] == 0) {
				anthill[ant.getX()][ant.getY()] = 9;
				ant.setY(ant.getY() + 1);
			} else if (anthill[ant.getX()][ant.getY()] == 1) {
				ant.setY(ant.getY() - 1);
				if (anthill[ant.getX() + 1][ant.getY()] != 1) {
					ant.setX(ant.getX() + 1);
				}

			} else {
				anthill[ant.getX()][ant.getY()] = 9;
				ant.setEat(false);
			}
		}

		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.printf("%d ", anthill[i][j]);
			}
			System.out.println();
		}

		sc.close();

	} // end main()

	static class Ant {
		private int x;
		private int y;
		private boolean eat;

		Ant(int x, int y) {
			this.x = x;
			this.y = y;
			this.eat = true;
		}

		public int getX() {
			return x;
		}

		public void setX(int x) {
			this.x = x;
		}

		public int getY() {
			return y;
		}

		public void setY(int y) {
			this.y = y;
		}

		public boolean isEat() {
			return eat;
		}

		public void setEat(boolean eat) {
			this.eat = eat;
		}

	} // end ant

} // end CodeUp1099
