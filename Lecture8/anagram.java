package Lecture8;

import java.util.Arrays;

public class anagram {
	public static void main(String[] args) {
		String s = "anagram";
		String t = "nagaram";
		System.out.println(validAnagram(s, t));
	}

	private static boolean validAnagram(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}

		char[] a = s.toCharArray();
		char[] b = t.toCharArray();

		Arrays.sort(a);

		Arrays.sort(b);

		for (int i = 0; i < b.length; i++) {
			if (a[i] != b[i]) {
				return false;
			}
		}
		return true;

	}

}
