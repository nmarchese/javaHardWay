public class CreatingVariables {
	public static void main( String[] args ) {
		int x, y, age, myAge;
		double seconds, e, checking, dub;
		String firstName, lastName, title, newString;

		x = 10;
		y = 400;
		age = 39;
		myAge = 25;

		seconds = 4.71;
		e = 2.71828182845904523536;
		checking = 1.89;
		dub = 7;

		firstName = "Graham";
		lastName = "Mitchell";
		title = "Mr.";
		newString = "Graham's age at the time of writing this book was probably ";

		System.out.println( "The variable x contains " + x );
		System.out.println( "The value " + y + " is stored in the variable y." );
		System.out.println( "The experiment took " + seconds + " seconds" );
		System.out.println( "A facorite irrational # is Euler's number: " + e );
		System.out.println( "Hopefully you have more than $" + checking + "!" );
		System.out.println( "My name's " + title + " " + firstName + lastName );
		System.out.println( "My age is " + myAge );
		System.out.println( "\"Doubles\" don't have to be a fraction, such as " + dub + "." );
		System.out.println( newString + age + "." );
	}
}