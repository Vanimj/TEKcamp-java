package tekJavaPrograms;

import java.util.Scanner;

public class ArrayDecendingOrder {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int[] myArray = getIntegers(5);
		for (int i = 0; i < myArray.length; i++) {

			System.out.println("The enterd values are :" + myArray[i]);
		}

		revArray(myArray);

		sortedArray(myArray);

		for (int i = 0; i < myArray.length; i++)
			System.out.println("The sorted list is :" + myArray[i]);

	}

	public static int[] getIntegers(int num) {
		System.out.println("Enter the number of integer values");
		int[] values = new int[num];
		for (int i = 0; i < values.length; i++) {
			values[i] = scanner.nextInt();
		}

		return values;
	}

	public static int[] sortedArray(int[] newArray) {
		int temp = 0;
		for (int i = 0; i < newArray.length; i++) {
			for (int j = i + 1; j < newArray.length; j++) {
				if (newArray[i] < newArray[j]) {
					temp = newArray[i];
					newArray[i] = newArray[j];
					newArray[j] = temp;
				}
			}
		}
		return newArray;
	}

	public static void revArray(int[] reverseArray) {

		for (int i = reverseArray.length-1; i >= 0; i--) {
			System.out.println("The Reversed Array is :" +reverseArray[i]);
		}
		//return reverseArray;

	}

}
