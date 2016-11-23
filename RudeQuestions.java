import java.util.Scanner;

public class RudeQuestions {
	public static void main( String[] args ) {
		String name, goodbye;
		int age;
		double weight, income;

		Scanner keyboard = new Scanner(System.in);

		System.out.print( "Hello. What is your name? " );
		name = keyboard.next();

		System.out.print( "Hi, " + name + "! How old are you? " );
		age = keyboard.nextInt();

		System.out.println( "So you're " + age + ", eh? That's not very old." );
		System.out.print( "How much do you weigh, " + name + "? " );
		weight = keyboard.nextDouble();

		System.out.println( weight + "! Better keep that quiet!!" );
		System.out.print( "Finally, what's your income, " + name + "? " );
		income = keyboard.nextDouble();

		System.out.print( "Hopefully that is " + income + " per hour" );
		System.out.println( " and not per year!" );
		System.out.print( "Well, thanks for answering my rude questions, " );
		System.out.println( name + "." );

		System.out.print( "Now, tell me Goodbye. " );
		goodbye = keyboard.next();
		System.out.println( "And a fond " + goodbye + " to you too!" );
		// 1. No, an integer can be stored in a double variable, it is just slightly less accurate.
		// 2. No, a number can be included in a string, it just can't be used as an int or double if it is stored as a string.
		// 3. Age can blow up if a double is used. Weight and Income can blow up if a number is not used, or a mathmatical function is used. 
	}
}