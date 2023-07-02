package algorithm.backjoon.greedy;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Greedy5585 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		N = 1000 - N;
		int[] tokens = {500, 100, 50, 10, 5, 1};
		int result = 0;
		while (N > 0) {
			for (int token : tokens) {
				if (N >= token) {
					result += N / token;
					N = N % token;
				}
			}
		}
		System.out.println(result);
	}
}

