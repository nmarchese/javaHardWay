import java.util.Scanner;

public class PigDice {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		int roll, ptot = 0, ctot = 0, turnTotal;
		String choice = "";

		do {
			turnTotal = 0;
			System.out.println("You have "+ptot+" points.");

			do {
				roll = 1+(int)(Math.random()*6);
				System.out.println("\tYou rolled a "+roll+" points.");
				if (roll == 1) {
					System.out.println("\tThat ends your turn.");
					turnTotal = 0;
				}
				else {
					turnTotal += roll;
					System.out.print("\tYou have "+turnTotal+" points so far this round.\n");
					System.out.print("\tWould you like to \"roll\" again or \"hold\"? ");
					choice = keyboard.next();
				}
			} while (roll != 1 && choice.equals("roll"));

			ptot += turnTotal;
			System.out.println("You end the round with "+ptot+" points.");

			if (ptot < 100) {
				turnTotal = 0;
				System.out.println("Computer has "+ctot+" points.");

				do {
					roll = 1+(int)(Math.random()*6);
					System.out.println("\tComputer rolled a "+roll+".");
					if (roll == 1) {
						System.out.println("\tThat ends its turn.");
						turnTotal = 0;
					}
					else {
						turnTotal += roll;
						System.out.print("\tComputer has "+turnTotal+" points so far this round.\n");
						if (turnTotal < 20 && (ctot+turnTotal)<100) {
							System.out.println("\tComputer will roll again.");
						}
					}
				} while ((ctot+turnTotal)<100 && roll != 1 && turnTotal < 20);

				ctot += turnTotal;
				System.out.print("Computer ends the round with "+ctot+" points.\n");
			}
		} while (ptot < 100 && ctot < 100);

		if (ptot > ctot)
			System.out.println("Humanity wins!");
		else
			System.out.println("The computer wins.");
	}
}