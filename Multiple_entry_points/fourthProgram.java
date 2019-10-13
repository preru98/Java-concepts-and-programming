//Java program to illustrate the concept of more than one classes in the single java program.
class fourthProgramPrimary {
	public static void main(String args[]) {
		System.out.println("\nWe are in the first class now.Thankyou.\n");
	}
}

class fourthProgramSecondary {
	public static void main(String args[]) {
		System.out.println("\nWe are in the second class currently.Thankyou.\n");
		System.out.println("We will now call Primary class from here.");
		String arr[] = { "Yey!" };
		fourthProgramPrimary.main(arr);

	}
}
