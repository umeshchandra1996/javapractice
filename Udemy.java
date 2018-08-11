package udemy;

public class Udemy {
	public static void main(String[] args) {

		// first lecture of udemy on data type

		/*
		 * // int width 32bit
		 * 
		 * int min_value = -2_147_483_648;// Two billion 147million 483 thousand 648 int
		 * max_value = 2_147_483_647; int my_total = (min_value / 2);
		 * System.out.println("Total integer " + my_total);
		 * 
		 * // byte width 8bit byte bytevalue = -128;// not-129 byte my_total_byte =
		 * (byte) (bytevalue / 2);// System.out.println("Total byte " + my_total_byte);
		 * 
		 * // short width16bit short shortvalue = 32767; short total_short = (short)
		 * (shortvalue / 2); System.out.println("Total short " + total_short);
		 * 
		 * // long width 64bit long longvalue = 9_223_372_036_854_775_807L; long
		 * total_long = (long) (longvalue / 2); System.out.println("Total long value " +
		 * total_long);
		 * 
		 * int a = 10; byte b = 15; short c = 142; long l; l = 5552266L + 10L * (a + b +
		 * c); short s = (short) (5552266 + 10L * (a + b + c));
		 * System.out.println("long value  " + l); System.out.println("Short value " +
		 * s);
		 */

		// second lecture
		double pound = 200d;
		double convertpount_to_kilogram = pound * .45359237d;
		System.out.println("pound to kilogram" + convertpount_to_kilogram);

	}

}
