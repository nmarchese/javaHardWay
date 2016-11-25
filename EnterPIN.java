import java.util.Scanner;

public class EnterPIN {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int pin, entry;
		String password, word;

		pin = 12345;
		password = "password";

		System.out.println("WELCOM TO THE BANK OF JAVA.");
		System.out.print("ENTER YOUR PASSWORD: ");
		word = keyboard.next();

		while ( ! password.equals(word)) {
			System.out.println("\nINCORRECT PASSWORD. TRY AGAIN.");
			System.out.print("ENTER YOUR PASSWORD: ");
			word = keyboard.next();
		}

		System.out.print("ENTER YOUR PIN: ");
		entry = keyboard.nextInt();

		while ( entry != pin ) {
			System.out.println("\nINCORRECT PIN. TRY AGAIN.");
			System.out.print("ENTER YOUR PIN: ");
			entry = keyboard.nextInt();
		}

		System.out.println("\nPIN ACCEPTED. YOUR ACCOUNT BALANCE IS $425.17");
	}
}