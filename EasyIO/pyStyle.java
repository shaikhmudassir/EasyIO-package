/***************************************************************************
 *     ========= *** Easy Input output & Type casting package *** ===========
 *     Developed By :  		1. Shaikh Mudassir Ahmed
 ***************************************************************************/

package EasyIO;
import java.util.Scanner;
public class pyStyle {
	/*** 
	 	Printing Methods :
	 	1.These methods will print what ever is written within circular brackets.
	 	2.String must be Written with Double Quotes(" ").
	 	3." + " Operator is used to concatenate String and to Separate Variables.
	 	4.If user wants Next print Statement within a same line so,he can Enable(true) 
	 	  By writing "true" as second argument.Example, 
	 	  
	 	  =================== Example ================
	 	  print("One line ",true);
	 	  print("Second line");
	 	   output:
	 	   	Oneline Second
	 	  =========================================== 	
	 ***/
	
	public static  void print(String str)    			 //Print String
	{
		System.out.println(str);
	}
	
	public static  void print(String str,boolean oneLine)   //Print String Single line
	{
		System.out.print(str);
	}
	
	public static  void print(int str)					//Print Integer integer 
	{
		System.out.println(str);
	}
	
	public static  void print(int str ,boolean oneLine)    //Print integer single line
	{
		System.out.print(str);
	}
	
	public static  void print(long str)					//Print Long integer 
	{
		System.out.println(str);
	}
	
	public static  void print(long str,boolean oneLine)    //Print Long integer single line
	{
		System.out.print(str);
	}
	
	public static  void print(double str)				//Print Double number 
	{
		System.out.println(str);
	}
	
	public static  void print(double str,boolean oneLine)	//Print Double number Single line
	{
		System.out.print(str);
	}
	
	/*** 
	 	Inserting Methods :
	 	1.All of these methods used to accept input from front end user.
	 	2.User can give description.It is the guidelines for the user.
	 	3.If user wants Description and input in a single line then he can Enable(true)the Single line method.  
	***/
	
	public static String input()							//input string
	{
		Scanner a = new Scanner(System.in);
		String str = a.nextLine();
		return str;
	}
	public static String input(String decs)				//input string with Description
	{
		System.out.println(decs);
		Scanner a = new Scanner(System.in);
		String str = a.nextLine();
		return str;
	}
	public static String input(String decs,boolean oneLine)   //input string with Description , Single line
	{
		System.out.print(decs);
		Scanner a = new Scanner(System.in);
		String str = a.nextLine();
		return str;
	}
	public static int insertInt()							//input Integer
	{
		Scanner a = new Scanner(System.in);
		int str = a.nextInt();
		return str;
	}
	public static int insertInt(String decs)				//input Integer with Description
	{
		System.out.println(decs);
		Scanner a = new Scanner(System.in);
		int str = a.nextInt();
		return str;
	}
	public static int insertInt(String decs,boolean oneLine)	//input Integer with Description,Single line
	{
		System.out.print(decs);
		Scanner a = new Scanner(System.in);
		int str = a.nextInt();
		return str;
	}
	public static double insertDouble()							//input Double
	{
		Scanner a = new Scanner(System.in);
		double str = a.nextDouble();
		return str;
	}
	public static double insertDouble(String decs)		//input Double with Description
	{
		System.out.println(decs);
		Scanner a = new Scanner(System.in);
		double str = a.nextDouble();
		return str;
	}
	public static double insertDouble(String decs,boolean oneLine) //input Double with Description,Single line
	{
		System.out.print(decs);
		Scanner a = new Scanner(System.in);
		double str = a.nextDouble();
		return str;
	}
	public static long insertLong()							//input Long
	{
		Scanner a = new Scanner(System.in);
		long str = a.nextLong();
		return str;
	}
	public static long insertLong(String decs)				//input Long with Description
	{
		System.out.println(decs);
		Scanner a = new Scanner(System.in);
		long str = a.nextLong();
		return str;
	}
	public static long insertLong(String decs,boolean oneLine)	//input Long with Description,Single line
	{
		System.out.print(decs);
		Scanner a = new Scanner(System.in);
		long str = a.nextLong();
		return str;
	}
	public static float insertFloat()							//input Float
	{
		Scanner a = new Scanner(System.in);
		float str = a.nextFloat();
		return str;
	}
	public static float insertFloat(String decs)				//input Float with Description
	{
		System.out.println(decs);
		Scanner a = new Scanner(System.in);
		float str = a.nextFloat();
		return str;
	}
	public static float insertFloat(String decs,boolean oneLine)				//input Float with Description,Single line
	{
		System.out.print(decs);
		Scanner a = new Scanner(System.in);
		float str = a.nextFloat();
		return str;
	}
	
	
	/*** 
	    Type Casting (Main)
	    1.All Type casting Methods has first Letter Capital. 
	    2.Type casting is done with String,Integer,Double,Long,Float data types.  
	***/
	
	/*** Type Casting Integer ***/
	
	public static int Int(String val)					// String to Integer type cast
	{
		int cast = Integer.parseInt(val);
		return cast;
	}
	
	public static int Int(long val)					// Long to Integer type cast
	{
		int cast = (int)val;
		return cast;
	}
	public static int Int(double val)					// Double to Integer type cast
	{
		int cast = (int)val;
		return cast;
	}
	public static int Int(float val)					// Float to Integer type cast
	{
		int cast = (int)val;
		return cast;
	}
	/*** Type Casting Long ***/
	
	public static long Long(String val)					// String to Long type cast
	{
		long cast = Long.parseLong(val);
		return cast;
	}
	public static long Long(int val)					// Integer to Long type cast
	{
		long cast = (long)val;
		return cast;
	}
	public static long Long(double val)					// Double to Long type cast
	{
		long cast = (long)val;
		return cast;
	}
	public static long Long(float val)					// Float to Long type cast
	{
		long cast = (long)val;
		return cast;
	}
	
	/*** Type Casting Double ***/
	
	public static double Double(String val)					// String to Double type cast
	{
		double cast = Double.parseDouble(val);
		return cast;
	}
	public static double Double(int val)					// Integer to Double type cast
	{
		double cast = (double)val;
		return cast;
	}
	public static double Double(long val)					// Long to Double type cast
	{
		double cast = (double)val;
		return cast;
	}
	public static double Double(float val)					// Float to Double type cast
	{
		double cast = (double)val;
		return cast;
	}
	
	/*** Type Casting Float ***/
	
	public static float Float(String val)					// String to Float type cast
	{
		float cast = Float.parseFloat(val);
		return cast;
	}
	public static float Float(int val)					// Integer to Float type cast
	{
		float cast = (float)val;
		return cast;
	}
	public static float Float(double val)					// Double to Float type cast
	{
		float cast = (float)val;
		return cast;
	}
	public static float Float(float val)					// Float to Float type cast
	{
		float cast = (float)val;
		return cast;
	}	
}
