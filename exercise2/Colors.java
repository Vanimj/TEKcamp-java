package tekJavaPrograms;

public class Colors {

	static String[] colorful(String[] strings) {
		// For the given strings, keep all the strings that begin with a color ("red",
		// "yellow", "green", "blue", etc.) return an array of strings that start with a
		// color. discard all the other strings. If no strings start with a color in the
		// input array, return an empty array.
		for (int i = 0; i < strings.length; i++) {
// 
			if (strings[i].contains("red") || strings[i].contains("yellow") || strings[i].contains("blue")
					|| strings[i].contains("green")) {
//        		
//        	
				System.out.println(strings[i]);
			}
			else if(strings[i]==" ") {
				System.out.println("empty String");
			}
		}
		return strings;
		// return new String[] {"red", "yellow", "green", "blue", " "};
	}
}
