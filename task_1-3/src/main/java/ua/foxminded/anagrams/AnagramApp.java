package main.java.ua.foxminded.anagrams;

import java.util.Scanner;

public class AnagramApp {

	public void execute() {
		final Anagram anagram = new AnagramImpl();

		System.out.print("Input your anagram: ");		
		Scanner input = new Scanner(System.in);
		String[] words = input.nextLine().split(" ");
		input.close();
		
		anagram.Reverse(words);
	}

	public static void main(String... args) {
		new AnagramApp().execute();
	}

}
