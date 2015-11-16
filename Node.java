public class Node {
	private Node next;

	public Node() {
		this.next = null;
	}

	public Node(Node next) {
		this.next = next;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
}