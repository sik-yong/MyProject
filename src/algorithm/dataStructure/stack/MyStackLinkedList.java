package algorithm.dataStructure.stack;
import java.util.LinkedList;

public class MyStackLinkedList<T> {
	private LinkedList<T> stack;

	public MyStackLinkedList() {
		stack = new LinkedList<>();
	}

	public void push(T t) {
		stack.addFirst(t);
	}

	public T pop() {
		if (stack.isEmpty())
			return null;
		return stack.removeFirst();
	}

	public T peek() {
		if (stack.isEmpty())
			return null;
		return stack.getFirst();
	}

	public boolean isEmpty() {
		return stack.isEmpty();
	}
}
