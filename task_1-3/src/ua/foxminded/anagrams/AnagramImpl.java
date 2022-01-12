package ua.foxminded.anagrams;

public class AnagramImpl implements Anagram {
	@Override
	public String reverse(String text) {

		if (text == null) {
			throw new IllegalArgumentException("Text can't be null!");
		}

		if (text.trim().isEmpty()) {
			return text;
		}

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
			reversedString.append(reverseLetters);
		}
		for (int c = 0; c < text.length(); c++) {
			if (text.charAt(c) == ' ') {
				reversedString.insert(c, text.charAt(c));
			}
		}
		return reversedString.toString();
	}
}
