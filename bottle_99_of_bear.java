package bottle_99_of_bear;

public class bottle_99_of_bear {
	public static void main(String[] agrs) {
		int beer = 100;
		while (beer > 0) {
			if (beer == 1) {
				System.out.println("Only one bottle left.");
			}
			beer--;
			if (beer > 0)
				System.out.println("left beer bottle " + beer);
			else {
				System.out.println("No more beer bottle ");
			}
		}

	}

}
