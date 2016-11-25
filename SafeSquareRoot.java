import java.util.Scanner;

public class SafeSquareRoot {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		double x, y;
		String ans;

		System.out.println("\nGive me a number, and I'll find it's square root. (No negatives, please.)");
		System.out.print("\nAre you ready?   > ");
		ans = keyboard.next();

		while (!ans.equals("YES!")) {
			System.out.println("\nPlease say \"YES!\" to continue.   > ");
			ans = keyboard.next();
		}

		System.out.print("Okay! Please enter the number you would like the square root of.   > ");
		x = keyboard.nextDouble();

		while (x < 0) {
			System.out.println("\nI won't take the square root of a negative.");
			System.out.print("\nNew number: ");
			x = keyboard.nextDouble();
		}

		y = Math.sqrt(x);

		System.out.println("The square root of "+x+" is "+y);
	}
}