package practise;

import java.util.Scanner;


public class CharacterCount {
	private static String inputString;

	public static void main(String args[]) {
		CharacterCount f = new CharacterCount();
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter String: ");
			inputString = sc.nextLine();
			f.countOccurance(inputString);
		}
	}

	void countOccurance(String inputString) {
		int[] counter = new int[256];
		for (int i = 0; i < inputString.length(); i++) {
			counter[inputString.charAt(i)]++;
		}
		for (int i = 0; i < 256; i++) {
			if (counter[i] != 0)
				System.out.println((char) i + " " + counter[i]);
		}
	}

	CharacterCount() {
		inputString = "";
	}
}
//Enter String: 
//abba dabba jabba
//  2
//a 6
//b 6
//d 1
//j 1
