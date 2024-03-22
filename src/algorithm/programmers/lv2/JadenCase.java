package algorithm.programmers.lv2;

public class JadenCase {

	//3people unFollowed me
	//for the last week
	public static String solution(String s) {
		String answer = "";
		String[] arr = s.toLowerCase().split(" ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].length() == 0)
				answer += " ";
			else {
				answer += arr[i].substring(0, 1).toUpperCase();
				answer += arr[i].substring(1, arr[i].length());
				answer += " ";
			}
		}
		if (s.substring(s.length() - 1, s.length()).equals(" ")) {
			return answer;
		}
		return answer.substring(0, answer.length() - 1);
	}

	public static String convertString(String s) {
		char firstChar = s.charAt(0);
		if (Character.isLowerCase(firstChar))
			return Character.toUpperCase(firstChar) + s.substring(1);
		else
			return s;
	}
}
