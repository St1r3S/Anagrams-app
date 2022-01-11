package ua.foxminded.anagrams;

public class AnagramImpl implements Anagram {
	@Override
	public String reverse(String text) {

		String[] words = text.split(" ");
		StringBuffer reversedString = new StringBuffer(text.length());
		for (int i = 0; i < words.length; i++) {

			StringBuffer letters = new StringBuffer(words[i]);
			StringBuffer reverseLetters = new StringBuffer(letters.length());

			for (int c = letters.length() - 1; c >= 0; c--) {
				if (Character.isLetter(letters.charAt(c))) {
					reverseLetters.append(letters.charAt(c));
				}
			}
			for (int c = 0; c < letters.length(); c++) {
				if (!Character.isLetter(letters.charAt(c))) {
					reverseLetters.insert(c, letters.charAt(c));
				}
			}
			reversedString.append(reverseLetters).append(" ");
		}
		return reversedString.toString();
	}
}
