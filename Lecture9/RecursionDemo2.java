package Lecture9;

public class RecursionDemo2 {
	public static void main(String[] args) {
		int i = 1;
		print(i);
	}

	private static void print(int i) {
		if (i > 5) {
			return;
		}
		System.out.println(i);
		print(i + 1);
		System.out.println(i);

	}
}
