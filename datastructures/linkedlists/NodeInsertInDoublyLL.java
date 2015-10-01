public class NodeInsertInDoublyLL {
	Node SortedInsert(Node head, int data) {
		if (head == null) {
			Node n = new Node();
			n.data = data;
			return n;
		}

		if (head.data > data) {
			Node x = new Node();
			x.data = data;
			x.next = head;
			head.prev = x;
			return x;
		}

		Node t = head;
		while (t.next != null && t.next.data < data) {
			t = t.next;
		}

		Node x = new Node();
		x.data = data;
		x.next = t.next;
		if (t.next != null) {
			x.prev = t.next.prev;
			t.next.prev = x;
		}
		t.next = x;

		return head;
	}
}
