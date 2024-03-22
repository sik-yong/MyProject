package algorithm.programmers.lv2;

import java.util.Stack;

public class CorrectParenthesis {

	public static boolean solution(String s) {
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				stack.push('(');
			} else if (s.charAt(i) == ')'){
				if(stack.empty())
					return false;
				stack.pop();
			}
		}
		return stack.isEmpty();
	}
}
