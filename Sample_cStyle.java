// ====================================================================
// EasyIO.cStyle :
// ================
// With Collaboration with Shaikh Mudassir Ahmed and his group
// Developed By Syed Minnatullah Quadri
// Last Updated On: Oct.2021
// ====================================================================


import static EasyIO.cStyle.*;


class Sample_cStyle {
	// THIS IS MAIN FUNCTION
	public static void main(String args[]) {
		print('y', "Greetings %s!\n", get_string('b', "What is your name : "));
		print('y', "Oh ! So you are %d years old!\n", get_int('b', "What is your age : "));
		print('y', "You have Entered %d\n", get_long('b', "What is your Phone number : "));
		print('y', "Casted(double <- int) Twice is %f\n", get_int('b', "Enter some Number : ") * 2);
		print('y', "Casted(int <- double) Twice is %d\n", get_double('b', "Enter some double to cast : ") * 2);
		// FOLLOWING CAN BE EXECUTED IF NEEDED
		// printing();
		// getting();
	}

	// JUST FOR REFERENCE, WILL NOT DISPLAY IN OUTPUT
	// UNLESS YOU PUT FOLLOWING FUNCTION IN "main()"
	static void printing() {
		// C PROGRAMMING FLAVOURED "printf("STYLE");"
		print("This is %s \n", "EasyIO.cStyle");
		// TRY FORMATTING
		print('r', "This is %s", "EasyIO.cStyle");
		print('r', "This is of red color line in output \n");
		print('g', "This is of green color line in output \n");
		print('y', "This is of yellow color line in output \n");
		print('b', "This is of blue color line in output \n");
		print('p', "This is of purple color line in output \n");
		print('c', "This is of cyan color line in output \n");
	}

	// JUST FOR REFERENCE, WILL NOT DISPLAY IN OUTPUT
	// UNLESS YOU PUT FOLLOWING FUNCTION IN "main()"
	static void getting() {
		int num1 = get_int(); //Without prompting description user
		int num2 = get_int("Please Enter Some number : ");
		int num3 = get_int("What is %d / 2 = ", num1*num2);
		int num4 = get_int('r', "What about %d * %d ", num3*num3 , num1);
		print(" Ended with %d \n",num4);
	}

}