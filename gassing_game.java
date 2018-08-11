package project1;

import java.util.Scanner;

public class gassing_game {
	public static void main(String[] args) {
		int num;
		num = (int) (Math.random() * 100);
		// System.out.println("gess num is" + num);

		int i = 0;
		while (i < 10) { //
			// int num1;
			System.out.println("Enter the number");
			Scanner gassnum = new Scanner(System.in);
			int num1 = gassnum.nextInt();
			if (num == num1) {
				System.out.println("Yes you find the number");
				gassnum.close();
			} else if (num1 > num) {
				System.out.println("You Enter the bigger number again try");
			} else if (num1 < num) {
				System.out.println("You Enter the lowest number again try");
			}

			i++;

		}
		System.out.println("You loose");

	}
}
