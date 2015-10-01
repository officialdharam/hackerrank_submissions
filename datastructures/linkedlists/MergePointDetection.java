public class MergePointDetection {
	int FindMergeNode(Node headA, Node headB) {
		Node tempA = headA;
		Node tempB = headB;
		int countA = 0;
		int countB = 0;
		while (tempA.next != null) {
			tempA = tempA.next;
			countA++;
		}
		while (tempB.next != null) {
			tempB = tempB.next;
			countB++;
		}
		Node temp1 = null;
		Node temp2 = null;
		Node temp = null;
		if (countA > countB) {
			tempA.next = headA;
			temp1 = headB;
			temp2 = headB;
			temp = headB;
		} else {
			tempB.next = headB;
			temp1 = headA;
			temp2 = headA;
			temp = headA;
		}

		do {
			temp1 = temp1.next;
			temp2 = temp2.next.next;
		} while (temp1 != temp2);

		while (temp != temp1) {
			temp = temp.next;
			temp1 = temp1.next;
		}
		return temp1.data;
	}
}
