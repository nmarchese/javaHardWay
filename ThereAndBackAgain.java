public class ThereAndBackAgain {
	public static void main( String[] args ) {
		System.out.println("Here.");
		ThereAndBackAgain.erbor();  // Added class "ThereAndBackAgain". Would not comple as written by book.
		System.out.println("Back first time.");
		ThereAndBackAgain.erbor();  // Went to my roommate for help and this is how we got around the compiler error.
		System.out.println("Back second time.");
	}

	public static void erbor() {
		System.out.println("There.");
	}
}