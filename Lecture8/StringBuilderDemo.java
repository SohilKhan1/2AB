package Lecture8;

public class StringBuilderDemo {

	public static void main(String[] args) {

		int start = (int) System.currentTimeMillis();
		
		String s = "abc";
		for (int i = 0; i < 100000; i++) {
			s = s + i;
		}
		int end = (int) System.currentTimeMillis();
		
		System.out.println(end-start);


		StringBuilder sb = new StringBuilder("abc");

		start = (int) System.currentTimeMillis();
		
		for (int i = 0; i < 100000; i++) {
			sb.append(i);
		}
		
		end = (int) System.currentTimeMillis();
		
		System.out.println(end-start);
	}

}
