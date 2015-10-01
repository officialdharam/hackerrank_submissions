public class InsertAtPosition {
	Node InsertNth(Node head, int data, int position) {
		Node temp = head;
		if (position == 0) {
			temp = new Node();
			temp.data = data;
			temp.next = head;

		} else {
			int count = 0;
			while (head.next != null && count < position - 1) {
				head = head.next;
				count++;
			}
			Node x = new Node();
			x.data = data;
			x.next = head.next;
			head.next = x;
		}
		return temp;
	}
}
