package algorithm.backjoon.greedy;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Greedy11047 {

	public static void main(String[] args) throws IOException {
		int N, K;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		int[] token = new int[N];

		for (int i = 0; i < N; i++) {
			token[i] = Integer.parseInt(br.readLine());
		}
		int answer = 0;
		for (int i = N - 1; i >= 0; i--) {
			if (K >= token[i]) {
				answer += K / token[i];
				K = K % token[i];
			}
		}

		System.out.println(answer);
	}
}
