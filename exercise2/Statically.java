package tekJavaPrograms;

public class Statically {

	// fix this code, so all of the instantiation and console.logs() work. Try not
	// to change the signature of the class, unless absolutely necessary.
	static String glue = "Epoxy";
	String jello = "Jello";

	public static void moveAndShake() {
		System.out.println("Never stagnate in life.  Be agile, change, and improve...");
	}

	public static void stubborn() {
		moveAndShake();
		System.out.println("Please don't make me change... I just don't like it...");
	}

	public static void explain() {
		stubborn();
		System.out.println(glue);
		// write an explanation for how the keyword static behaves differently in
		// javascript vs. java.
	}

}

// get the below code to run correctly without errors: Make sure you explain
// what you did in the the explain() method, defined in the class. Do NOT remove
// the 'static' keyword from the explain() method.

//	//Once you have finished getting statistically.js to run, refactor the code here in Java.
