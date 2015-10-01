public class InsertAtHead {
	Node Insert(Node head, int x) {
		Node temp = new Node();
		temp.data = x;
		if (head == null) {
			head = temp;
		} else {
			temp.next = head;
			head = temp;
		}
		return head;
	}
}
