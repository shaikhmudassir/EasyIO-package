import static EasyIO.EasyIO.*;
class Sample
{
	public static void main(String args[])
	{
		print('y',"Greetings %s!\n",get_string('b',"What is your name : "));
		print('y',"Oh ! So you are %d years old!\n",get_int('b',"What is your age : "));
		print('y',"You have Entered %d\n",get_long('b',"What is your Phone number : "));
		print('y',"Twise is %f\n",get_double('b',"Enter some Number : ")*2);
		
	}
}