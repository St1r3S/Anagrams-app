package ua.foxminded.anagrams;

import java.util.Scanner;

public class AnagramApp {

	public void execute() {
		final Anagram anagram = new AnagramImpl();
		String reversedString;
		System.out.print("Input your anagram: ");
		try (Scanner input = new Scanner(System.in)) {
			String text = input.nextLine();

			reversedString = anagram.reverse(text);
			System.out.println(reversedString);
		}
	}

	public static void main(String... args) {
		new AnagramApp().execute();
	}

}
