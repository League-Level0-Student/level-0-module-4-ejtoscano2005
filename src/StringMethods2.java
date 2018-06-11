import java.util.Random;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

public class StringMethods2 {
	public static void main(String[] args) {

		// 1. Create a String variable and initialize it with
		// random upper and lower case characters.
		String a = "QwErTyUiOpAsDfGhJkLzXcVbNm";
		// 2. Print your String to the console in upper case.
		System.out.println(a.toUpperCase());
		// 3. Print your String to the console in lower case.
		System.out.println(a.toLowerCase());
		// 4. Print the first 3 char's of your String
		// HINT: .substring(start,end)
		for (int x = 0; x < 3; x++) {
			System.out.println(a.substring(x, x + 1));

		}
		// 5. Print a single char somewhere in the middle of your String
		// REMINDER: char's in string start at index 0
		Random numGen = new Random();
		int r = numGen.nextInt(a.length());
		for (int b = 0; b < a.length(); b++) {
			if (b == r) {
				System.out.print("0");
			}

			System.out.print(a.charAt(b));

		}
		// 6. BONUS -- print the LAST 3 char's of your string using
		// .length() to determine WHERE the last 3 char's are located.

		System.out.println("\n" + a.substring(a.length() - 3, a.length()));
	}
}
