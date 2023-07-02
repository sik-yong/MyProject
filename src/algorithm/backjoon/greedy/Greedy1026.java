package algorithm.backjoon.greedy;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Greedy1026 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		int[] arrA = new int[N];
		Integer[] arrB = new Integer[N];
		int result = 0;
		// Array A
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arrA[i] = Integer.parseInt(st.nextToken());
		}
		// Array B
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arrB[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(arrA);
		Arrays.sort(arrB, Collections.reverseOrder());

		for (int i = 0; i < N; i++) {
			result += arrA[i] * arrB[i];
		}
		System.out.println(result);
	}
}
