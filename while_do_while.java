package while_do_while;

import java.util.Scanner;

public class while_do_while {
	public static void main(String[] args) {
		int i;
		Scanner num = new Scanner(System.in);
		i = num.nextInt();
		while (true) {
			if (i == 10)
				break;
			System.out.println("i=" + i);
			i--;
			num.close();
		}

	}

}
