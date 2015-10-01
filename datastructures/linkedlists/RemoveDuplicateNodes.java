public class RemoveDuplicateNodes {
	Node RemoveDuplicates(Node head) {
		if (head == null)
			return null;
		Node temp = head;
		while (head.next != null) {
			if (head.data == head.next.data) {
				head.next = head.next.next;
			} else
				head = head.next;
		}
		return temp;
	}
}
