public class ReverseDoublyLL {
	Node Reverse(Node head) {
		if (head == null || head.next == null)
			return head;

		Node C = head;
		Node HoR = null;
		Node HoU = null;
		while (C != null) {
			HoU = C.next;
			if (HoU != null)
				HoU.prev = C;
			C.next = HoR;
			if (HoR != null)
				HoR.prev = C;
			HoR = C;
			C = HoU;

		}

		return HoR;
	}
}
