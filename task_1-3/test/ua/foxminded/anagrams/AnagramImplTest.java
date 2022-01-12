package ua.foxminded.anagrams;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AnagramImplTest {

	Anagram anagramImpl = new AnagramImpl();

	@Test
	void shouldVerifySingleCharacterInput() {
		assertEquals("a ", anagramImpl.reverse("a"));
	}

	@Test
	void shouldVerifySameCharacterInLowerAndUpperCasesMixedInInput() {
		assertEquals("aAaAaA ", anagramImpl.reverse("AaAaAa"));
	}

	@Test
	void shouldVerifyMultipleSameCharacterInput() {
		assertEquals("AAAA ", anagramImpl.reverse("AAAA"));
	}

	@Test
	void shouldVerifyWordWithDifferentLettersInput() {
		assertEquals("ecapS ", anagramImpl.reverse("Space"));
	}

	@Test
	void shouldVerifyOnlySymbolsInput() {
		assertEquals("?./?? ", anagramImpl.reverse("?./??"));
	}

	@Test
	void shouldVerifySeveralWordsInput() {
		assertEquals("ecapS aitnemed ", anagramImpl.reverse("Space dementia"));
	}

	@Test
	void shouldVerifySeveralWordsWithNumbersInsteadOfLettersInput() {
		assertEquals("capS3 a3t3nm1d ", anagramImpl.reverse("Spac3 d3m3nt1a"));
	}

	@Test
	void shouldVerifySeveralSpaceInput() {
		assertThrows(IllegalArgumentException.class, () -> anagramImpl.reverse("\0\0\0\0"));
	}

	@Test
	void shouldVerifySingleSpaceInput() {
		assertThrows(IllegalArgumentException.class, () -> anagramImpl.reverse("\0"));
	}

	@Test
	void shouldThrowExceptionOnNull() {
		assertThrows(IllegalArgumentException.class, () -> anagramImpl.reverse(null));
	}

	@Test
	void shouldThrowExceptionOnEmptyString() {
		assertThrows(IllegalArgumentException.class, () -> anagramImpl.reverse(""));
	}
}
