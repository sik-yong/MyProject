package algorithm.dataStructure.stack;
import java.util.ArrayList;

public class MyStack<T> {
	private ArrayList<T> stack = new ArrayList<>();

	public void push(T t){
		stack.add(t);
	}

	public T pop(){
		if(stack.isEmpty())
			return null;
		return stack.remove(stack.size() -1 );
	}

	public boolean isEmpty(){
		return stack.isEmpty();
	}

	public static void main(String[] args){
		MyStack<Integer> ms = new MyStack<>();
		ms.push(1);
		ms.push(2);
		System.out.println(ms.pop());
		ms.push(34);
		System.out.println(ms.pop());
		System.out.println(ms.pop());
	}
}
