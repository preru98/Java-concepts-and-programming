class fifthProgram {
	public static void main(String args[]) {
		System.out.println("\nWe are in primary main currently.");
		System.out.println("We will call secondary main now.");
		main(args, args);

	}

	public static void main(String args[], String args2[]) {
		System.out.println("\nWe are in secondary main now.");
		System.out.println("I am here because primary called me.Yey.");
	}
}