package Lecture8;

public class CountVovels {
	public static void main(String[] args) {
		String str = "hello";
		vovels(str);
	}

	private static void vovels(String str) {

		int count = 0;
		int count2=0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}else {
				count2++;
			}
		}
		System.out.println(count);
		System.out.println(count2);
		System.out.println(str.length()-count);



	}

}
