// ====================================================================
// ====================================================================
// *                        EasyIO.cStyle
//       ----------------------------------------------------
//               C PROGRAMMING STYLE INPUT AND OUTPUT
// ====================================================================
// With Collaboration with Shaikh Mudassir Ahmed and his group
// Developed By Syed Minnatullah Quadri
// Last Updated On: Oct.2021
// ====================================================================
// ====================================================================

package EasyIO;

import java.util.Scanner;

public class cStyle {

	// ====================================================================
	// PRINTING OUTPUT TO USER:
	// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	// PRINTING ALL-IN-ONE - "C style printf()" - unformatted and formatted
	// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	// ====================================================================

	public static void print(String format, Object... args) {
		System.out.printf(format, args);
	}

	public static void print(char color_number, String format, Object... args) {
		colorize(color_number);
		System.out.printf(format, args);
		decolorize();
	}

	public static void colorize(char color_number) {
		switch (color_number) {
		case 'r': // red
			System.out.printf("\033[31;1m");
			break;
		case 'g': // green
			System.out.printf("\033[32;1m");
			break;
		case 'y': // yellow
			System.out.printf("\033[33;1m");
			break;

		case 'b': // blue
			System.out.printf("\033[34;1m");
			break;

		case 'p': // purple
			System.out.printf("\033[35;1m");
			break;

		case 'c': // cyan
			System.out.printf("\033[36;1m");
			break;

		default:
			System.out.printf("\033[0m");
		}
	}

	public static void decolorize() {
		System.out.printf("\033[0m");
	}

	// ====================================================================
	// GETTING INPUT FROM USER :
	// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	// GETTING STRINGS - With line or with continuation or with formatting
	// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	// ====================================================================

	public static String get_string() {
		Scanner obj = new Scanner(System.in);
		String output = obj.nextLine();
		return output;

	}

	public static String get_string(String format, Object... args) {
		System.out.printf(format, args);
		Scanner obj = new Scanner(System.in);
		String output = obj.nextLine();
		return output;

	}

	public static String get_string(char color_number, String format, Object... args) {
		colorize(color_number);
		System.out.printf(format, args);
		decolorize();
		Scanner obj = new Scanner(System.in);
		String output = obj.nextLine();
		return output;
	}

	// ====================================================================
	// GETTING INPUT FROM USER :
	// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	// GETTING INTEGER - With line or with continuation or with formatting
	// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	// ====================================================================

	public static int get_int() {
		Scanner obj = new Scanner(System.in);
		int output = obj.nextInt();
		return output;
	}

	public static int get_int(String format, Object... args) {
		System.out.printf(format, args);
		Scanner obj = new Scanner(System.in);
		int output = obj.nextInt();
		return output;

	}

	public static int get_int(char color_number, String format, Object... args) {
		colorize(color_number);
		System.out.printf(format, args);
		decolorize();
		Scanner obj = new Scanner(System.in);
		int output = obj.nextInt();
		return output;
	}

	// ====================================================================
	// GETTING INPUT FROM USER :
	// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	// GETTING DOUBLE - With line or with continuation or with formatting
	// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	// ====================================================================

	public static double get_double() {
		Scanner obj = new Scanner(System.in);
		double output = obj.nextDouble();
		return output;
	}

	public static double get_double(String format, Object... args) {
		System.out.printf(format, args);
		Scanner obj = new Scanner(System.in);
		double output = obj.nextDouble();
		return output;

	}

	public static double get_double(char color_number, String format, Object... args) {
		colorize(color_number);
		System.out.printf(format, args);
		decolorize();
		Scanner obj = new Scanner(System.in);
		double output = obj.nextDouble();
		return output;
	}

	// ====================================================================
	// GETTING INPUT FROM USER :
	// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	// GETTING LONG - With line or with continuation or with formatting
	// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	// ====================================================================

	public static long get_long() {
		Scanner obj = new Scanner(System.in);
		long output = obj.nextLong();
		return output;
	}

	public static long get_long(String format, Object... args) {
		System.out.printf(format, args);
		Scanner obj = new Scanner(System.in);
		long output = obj.nextLong();
		return output;

	}

	public static long get_long(char color_number, String format, Object... args) {
		colorize(color_number);
		System.out.printf(format, args);
		decolorize();
		Scanner obj = new Scanner(System.in);
		long output = obj.nextLong();
		return output;
	}

	// ====================================================================
	// GETTING INPUT FROM USER :
	// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	// GETTING FLOAT - With line or with continuation or with formatting
	// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	// ====================================================================

	public static float get_float() {
		Scanner obj = new Scanner(System.in);
		float output = obj.nextFloat();
		return output;
	}

	public static float get_float(String format, Object... args) {
		System.out.printf(format, args);
		Scanner obj = new Scanner(System.in);
		float output = obj.nextFloat();
		return output;

	}

	public static float get_float(char color_number, String format, Object... args) {
		colorize(color_number);
		System.out.printf(format, args);
		decolorize();
		Scanner obj = new Scanner(System.in);
		float output = obj.nextFloat();
		return output;
	}
}