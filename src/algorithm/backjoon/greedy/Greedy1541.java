package algorithm.backjoon.greedy;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Greedy1541 {

	public static void main(String[] args) throws IOException {
		// 덧셈을 우선처리
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int result = Integer.MAX_VALUE;
		StringTokenizer st = new StringTokenizer(br.readLine(), "-");
		while (st.hasMoreTokens()) {
			int tmp = 0;

			StringTokenizer add = new StringTokenizer(st.nextToken(), "+");

			while (add.hasMoreTokens()) {
				tmp += Integer.parseInt(add.nextToken());
			}

			if (result == Integer.MAX_VALUE) {
				result = tmp;
			} else {
				result -= tmp;
			}
		}
		System.out.println(result);
	}
}
