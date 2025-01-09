package Lecture2;

public class ContainerWithMostWater {
	public static void main(String[] args) {
		int[] arr = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };

		int water = 0;
		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {
				int width = j - i;
				int hight = Math.min(arr[i], arr[j]);
				int waterhold = hight * width;
				water = Math.max(water, waterhold);
			}

		}
		
		System.out.println(water);

	}
}
