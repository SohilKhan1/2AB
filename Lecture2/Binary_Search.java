package Lecture2;

public class Binary_Search {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14 };
		int target = 130;
		binarySearch(arr, target);
	}

	private static void binarySearch(int[] arr, int target) {

		int start = 0;
		int end = arr.length - 1;

		while (start < end) {
			int mid = (start + end) / 2;
			if (arr[mid] == target) {
				System.out.println("True");
				return;
			} else if (arr[mid] < target) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}

		System.out.println("False");

	}

}
