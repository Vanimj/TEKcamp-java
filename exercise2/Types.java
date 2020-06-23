package tekJavaPrograms;

public class Types {
	// This class has syntax errors, that will prevent your other classes from
	// running. So... work on this file first to resolve the issues.
	static int number = 10;
	static int[] myArray = { 3, 4, 5, 6, 76, 12, 2 };
	static String movieA = "Harry and the Hendersons";
	static String movieB = "Star Wars";
	static char male = 'm';
	static char female = 'f';

	public static void main(String[] args) {

		System.out.println("The number is :" + number);
		System.out.println("Movie A is :" + movieA);
		System.out.println("Movie B is :" + movieB);
		System.out.println("Male character is :" + male);
		System.out.println("Female character is :" + female);
		for (int i = 0; i < myArray.length; i++) {
			System.out.println("My array elments are :" + myArray[i]);
		}

		// the above instance variables have mistakes with their data types. Fix the
		// data types so the main method correctly displays the value of all of the
		// variables

		System.out.println(
				"There are variables that have been declared in this Accessible class.  Fix the code so that all the variables can be accessed by the main method.  print out the values of every variable once the code has been refactored.");

	}
}
