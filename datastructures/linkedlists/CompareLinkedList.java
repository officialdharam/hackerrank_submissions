public class CompareLinkedList {
	int CompareLists(Node headA, Node headB) {
		if (headA == null && headB == null)
			return 1;
		if (headA == null)
			return 0;
		if (headB == null)
			return 0;
		if (headA.data == headB.data)
			return CompareLists(headA.next, headB.next);
		return 0;
	}
}
