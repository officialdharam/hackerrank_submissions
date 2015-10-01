public class ReverseLinkedList {
	Node Reverse(Node head) {
		if (head == null || head.next == null)
			return head;

		Node C = head;
		Node HoR = null;
		Node HoU = null;
		while (C != null) {
			HoU = C.next;
			C.next = HoR;
			HoR = C;
			C = HoU;
		}
		return HoR;
	}
}
