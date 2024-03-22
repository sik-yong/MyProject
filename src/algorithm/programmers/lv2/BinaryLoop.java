package algorithm.programmers.lv2;
public class BinaryLoop {
	private static int binaryCount = 0;
	private static int deletedZeroCount = 0;

	private static String str = "";
	public static int[] solution(String s) {
		str = s;
		while(!str.equals("1")){
			str = deleteZero(str);
			str = binary(str);
		}
		int[] answer = {deletedZeroCount,binaryCount};
		return answer;
	}

	public static String deleteZero(String s){
		deletedZeroCount += Integer.parseInt(String.valueOf(s.chars().filter(c -> c == '0').count()));
		return s.replace("0", "");
	}

	public static String binary(String s){
		binaryCount++;
		return Integer.toBinaryString(s.length());
	}

	public static void main(String[] args) {
		solution("110010101001");

	}
}
