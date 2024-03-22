package algorithm.programmers.lv2;
import java.util.Arrays;

public class MinimumValue {

	public static void main(String[] args) {
		solution(new int[]{1, 4, 2}, new int[]{5, 4, 4});
	}
	public static int solution(int[] A, int[] B) {
		int answer = 0;
		Arrays.sort(A);
		Arrays.sort(B);
		for (int i = 0; i < A.length; i++) {
			answer += A[i] * B[B.length - i - 1];
		}
		return answer;
	}
}
