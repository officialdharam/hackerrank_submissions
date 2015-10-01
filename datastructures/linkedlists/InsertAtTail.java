public class InsertAtTail {
	Node Insert(Node head, int data) {
		Node n = head;
		if (head == null) {
			n = new Node();
			n.data = data;
			head = n;
		} else {
			while (n.next != null) {
				n = n.next;
			}
			Node temp = new Node();
			temp.data = data;
			n.next = temp;
		}
		return head;
	}
}
