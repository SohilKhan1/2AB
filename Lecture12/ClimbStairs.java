package Lecture12;

public class ClimbStairs {
	public static void main(String[] args) {
		int n = 4;
		jump(n, "");
	}

	private static void jump(int n, String ans) {
		if (n == 0) {
			System.out.println(ans);
			return;
		}
		jump(n - 1, ans + 1);
		if (n >= 2)
			jump(n - 2, ans + 2);

	}

}
