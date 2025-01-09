package Lecture2;

public class array_Min_Max {
	public static void main(String[] args) {
		int[] arr = { 12, 25, 67, 76, 2, };
		min(arr);
		max(arr);
	}

	private static void max(int[] arr) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}

	private static void min(int[] arr) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println(min);
	}

}
