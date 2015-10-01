public class MergeSortedLinkedList {
	Node MergeLists(Node headA, Node headB) {
		if (headA == null)
			return headB;
		if (headB == null)
			return headA;

		if (headA.data > headB.data) {
			headB.next = MergeLists(headB.next, headA);
			return headB;
		} else {
			headA.next = MergeLists(headB, headA.next);
			return headA;
		}
	}
}
