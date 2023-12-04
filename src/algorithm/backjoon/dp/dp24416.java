package algorithm.backjoon.dp;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class dp24416 {
	static int i = 0;
	static int j = 0;
	static int[] memo;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		memo = new int[n];
		fib(n);
		fibonacci(n);

		System.out.println(i);
		System.out.println(j);
	}

	public static int fib(int n) {
		if (n == 1 || n == 2) {
			i++;
			return 1;
		} else {
			return fib(n - 1) + fib(n - 2);
		}
	}

	public static int fibonacci(int n) {
		memo[0] = 1;
		memo[1] = 1;
		for (int k = 2; k < n; k++) {
			j++;
			memo[k] = memo[k - 2] + memo[k - 1];
		}
		return memo[n - 1];
	}
}
