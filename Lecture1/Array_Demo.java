package Lecture1;

public class Array_Demo {
	public static void main(String[] args) {

		int[] arr = { 1, 12, 3, 4, 5 };
		
//		System.out.println(arr);

//		System.out.println(arr.length);

		int data = 12;

		linearSearch(arr, data);

	}

	private static void linearSearch(int[] arr, int data) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == data) {
				System.out.println("True");
				return;
			}
		}
		System.out.println(false);

	}

}
