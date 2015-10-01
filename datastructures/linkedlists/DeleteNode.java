public class DeleteNode {
	Node Delete(Node head, int position) {
		if (position == 0) {
			return head.next;
		} else {
			Node T = head;
			int count = 0;
			while (count < position - 1) {
				T = T.next;
				count++;
			}
			T.next = T.next.next;
		}
		return head;
	}
}
