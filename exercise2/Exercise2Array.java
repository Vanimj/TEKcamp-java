package tekJavaPrograms;

public class Exercise2Array {

	public static void main(String[] args) {

		printNums();
		printGreetings();
		printBinaries();

	}

	public static void printNums() {
		int[] nums = { 10, 23, 3, 4, 5, 2, 1 };

		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
	}

	public static void printGreetings() {

		String[] greetings = { "hello", "howdy", "hallo", "hola", "bonjour", "ciao", "أهلا" };

		for (int i = 0; i < greetings.length; i++) {
			System.out.println(greetings[i]);
		}
	}

	public static void printBinaries() {

		int[] binaries = { 0, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 0, 1, 0, 0, 1, 0 };

		for (int i = 0; i < binaries.length; i++) {
			System.out.println(binaries[i]);
		}
	}

}
