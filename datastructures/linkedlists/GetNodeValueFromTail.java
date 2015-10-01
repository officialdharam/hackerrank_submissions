public class GetNodeValueFromTail {
	int GetNode(Node head, int n) {
		Node temp = head;
		int counter = 0;
		while (head.next != null) {
			if (counter >= n) {
				temp = temp.next;
			}
			head = head.next;
			counter++;
		}
		return temp.data;
	}
}
