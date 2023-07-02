package algorithm.dataStructure.linkedList;
public class MyLinkedList<T> {
	private Node<T> head = null;
	private Node<T> tail = null;

	public void addNode(T t) {
		if (this.head == null) {
			this.head = new Node<T>(t);
			this.tail = this.head;
		} else {
			Node<T> node = this.head;
			while (node.next != null) {
				node = node.next;
			}
			node.next = new Node<T>(t);
			node.next.prev = node;
			this.tail = node.next;
		}
	}

	public T searchFromHead(T isData) {
		if (this.head == null) {
			return null;
		} else {
			Node<T> node = this.head;
			while (node != null) {
				if (node.data == isData) {
					return node.data;
				} else {
					node = node.next;
				}
			}
			return null;
		}
	}

	public T searchFromTail(T isData) {
		if (this.head == null) {
			return null;
		} else {
			Node<T> node = this.tail;
			while (node != null) {
				if (node.data == isData) {
					return node.data;
				} else {
					node = node.prev;
				}
			}
			return null;
		}
	}

	// 추가
	public boolean insertToFront(T existedData, T addData) {
		if (this.head == null) {
			this.head = new Node<T>(addData);
			this.tail = this.head;
			return true;
		} else if (this.head.data == existedData) {
			Node<T> newHead = new Node<T>(addData);
			newHead.next = this.head;
			this.head = newHead;
			return true;
		} else {
			Node<T> node = this.head;
			while (node != null) {
				if (node.data == existedData) {
					// nodePrev -> node -> nodeNext
					Node<T> nodePrev = node.prev;

					// nodePrev -> new node -> node -> nodeNext
					nodePrev.next = new Node<T>(addData);
					nodePrev.next.next = node;
					return true;
				} else {
					node = node.next;
				}
			}
			return false;
		}
	}

	public static void main(String[] args) {
		MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();

		myLinkedList.addNode(1);
		myLinkedList.addNode(2);
		myLinkedList.addNode(3);
		myLinkedList.addNode(4);
		myLinkedList.addNode(5);
		myLinkedList.printAll();
		System.out.println("----------------");

		myLinkedList.insertToFront(3, 2);
		myLinkedList.printAll();
		System.out.println("----------------");

		myLinkedList.insertToFront(6, 2);
		myLinkedList.insertToFront(1, 0);
		myLinkedList.printAll();
		System.out.println("----------------");

		myLinkedList.addNode(6);
		myLinkedList.printAll();

	}

	public void printAll() {
		if (this.head != null) {
			Node<T> node = this.head;
			System.out.println(node.data);
			while (node.next != null) {
				node = node.next;
				System.out.println(node.data);
			}
		}
	}

	private class Node<T> {
		private T data;
		private Node<T> next;
		private Node<T> prev;

		public Node(T t) {
			this.data = t;
		}
	}
}

