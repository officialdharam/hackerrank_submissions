public class DetectLoop {
	int HasCycle(Node head) {
		Node fast = head;
		Node slow = head;
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next; // if fast and slow pointers are meeting then
								// LinkedList is cyclic
			if (fast == slow) {
				return 1;
			}
		}
		return 0;
	}
}
