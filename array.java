package while_do_while;

import java.util.Scanner;

public class array {
	public static void main(String[] args) {
		/*
		 * Scanner obj = new Scanner(System.in); int num[] = new int[5];
		 * System.out.println("Enter the 5 integer"); for (int i = 0; i < 5; i++) {
		 * num[i] = obj.nextInt(); } obj.close();
		 * System.out.println("You enter the intger "); for (int i = 0; i < 5; i++) {
		 * System.out.println(num[i]); }
		 */
		int num[][] = new int[5][5];
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the 2d array");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				num[i][j] = obj.nextInt();
			}

		}
		obj.close();
		System.out.println("You enter the 2d array");

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(num[i][j] + " ");
			}
			System.out.println();

		}

	}

}
