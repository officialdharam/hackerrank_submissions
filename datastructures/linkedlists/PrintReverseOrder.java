public class PrintReverseOrder {
	void ReversePrint(Node head) {
		if (head == null)
			return;
		if (head.next != null) {
			ReversePrint(head.next);
		}
		System.out.println(head.data);
	}
}
