public class ThereAndBackAgain {
	public static void main( String[] args ) {
		System.out.println("Here.");
		erebor();  
		System.out.println("Back first time.");
		erebor();
		System.out.println("Back second time.");
	}

	public static void erebor() {
		System.out.println("There.");

	/*There had been a typo causing compiler error in previous code.
	Found the error, no need to define class before calling erebor function */
	}
}