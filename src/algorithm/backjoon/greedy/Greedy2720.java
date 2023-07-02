package algorithm.backjoon.greedy;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Greedy2720 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int quarter = 25;
		int dime = 10;
		int nickel = 5;
		int penny = 1;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; i++) {
			int income = Integer.parseInt(br.readLine());
			sb.append(income / quarter + " ");
			income = income % quarter;
			sb.append(income / dime + " ");
			income = income % dime;
			sb.append(income / nickel + " ");
			income = income % nickel;
			sb.append(income / penny + " \n");
		}
		System.out.println(sb);
	}
}
