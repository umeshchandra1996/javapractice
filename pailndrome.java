package project2;

import java.util.Scanner;

public class pailndrome {
	public static void main(String[] args) {
		int reminder, numcopy, sum = 0;

		System.out.println("Enter the number");
		Scanner pailndrome = new Scanner(System.in);
		int a = pailndrome.nextInt();
		pailndrome.close();

		numcopy = a;
		while (a > 0) {
			reminder = a % 10;
			sum = (sum * 10) + reminder;
			a = a / 10;

		}

		if (sum == numcopy) {
			System.out.println("YES, it is PALINDROME NUMBER");
		} else {
			System.out.println("NO,it is not a palindrome number");
		}

	}
}